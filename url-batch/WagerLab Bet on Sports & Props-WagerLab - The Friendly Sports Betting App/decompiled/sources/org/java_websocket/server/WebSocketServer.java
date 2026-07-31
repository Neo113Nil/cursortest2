package org.java_websocket.server;

import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket.AbstractWebSocket;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketFactory;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.WrappedByteChannel;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.exceptions.WrappedIOException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.Handshakedata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes9.dex */
public abstract class WebSocketServer extends AbstractWebSocket implements Runnable {
    private static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    private final InetSocketAddress address;
    private BlockingQueue<ByteBuffer> buffers;
    private final Collection<WebSocket> connections;
    protected List<WebSocketWorker> decoders;
    private List<Draft> drafts;
    private List<WebSocketImpl> iqueue;
    private final AtomicBoolean isclosed;
    private final Logger log;
    private int maxPendingConnections;
    private int queueinvokes;
    private final AtomicInteger queuesize;
    private Selector selector;
    private Thread selectorthread;
    private ServerSocketChannel server;
    private WebSocketServerFactory wsf;

    public abstract void onClose(WebSocket webSocket, int i, String str, boolean z);

    public void onCloseInitiated(WebSocket webSocket, int i, String str) {
    }

    public void onClosing(WebSocket webSocket, int i, String str, boolean z) {
    }

    protected boolean onConnect(SelectionKey selectionKey) {
        return true;
    }

    public abstract void onError(WebSocket webSocket, Exception exc);

    public abstract void onMessage(WebSocket webSocket, String str);

    public void onMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(WebSocket webSocket, ClientHandshake clientHandshake);

    public abstract void onStart();

    protected void releaseBuffers(WebSocket webSocket) throws InterruptedException {
    }

    public WebSocketServer() {
        this(new InetSocketAddress(80), AVAILABLE_PROCESSORS, null);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, AVAILABLE_PROCESSORS, null);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, AVAILABLE_PROCESSORS, list);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<WebSocket> collection) {
        this.log = LoggerFactory.getLogger((Class<?>) WebSocketServer.class);
        this.isclosed = new AtomicBoolean(false);
        this.queueinvokes = 0;
        this.queuesize = new AtomicInteger(0);
        this.wsf = new DefaultWebSocketServerFactory();
        this.maxPendingConnections = -1;
        if (inetSocketAddress == null || i < 1 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null) {
            this.drafts = Collections.emptyList();
        } else {
            this.drafts = list;
        }
        this.address = inetSocketAddress;
        this.connections = collection;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.iqueue = new LinkedList();
        this.decoders = new ArrayList(i);
        this.buffers = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            this.decoders.add(new WebSocketWorker());
        }
    }

    public void start() {
        if (this.selectorthread != null) {
            throw new IllegalStateException(getClass().getName() + " can only be started once.");
        }
        new Thread(this).start();
    }

    public void stop(int i) throws InterruptedException {
        stop(i, "");
    }

    public void stop(int i, String str) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.isclosed.compareAndSet(false, true)) {
            synchronized (this.connections) {
                arrayList = new ArrayList(this.connections);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((WebSocket) it.next()).close(1001, str);
            }
            this.wsf.close();
            synchronized (this) {
                if (this.selectorthread != null && (selector = this.selector) != null) {
                    selector.wakeup();
                    this.selectorthread.join(i);
                }
            }
        }
    }

    public void stop() throws InterruptedException {
        stop(0);
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<WebSocket> getConnections() {
        Collection<WebSocket> unmodifiableCollection;
        synchronized (this.connections) {
            unmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.connections));
        }
        return unmodifiableCollection;
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public int getPort() {
        ServerSocketChannel serverSocketChannel;
        int port = getAddress().getPort();
        return (port != 0 || (serverSocketChannel = this.server) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    public List<Draft> getDraft() {
        return Collections.unmodifiableList(this.drafts);
    }

    public void setMaxPendingConnections(int i) {
        this.maxPendingConnections = i;
    }

    public int getMaxPendingConnections() {
        return this.maxPendingConnections;
    }

    @Override // java.lang.Runnable
    public void run() {
        SelectionKey selectionKey;
        if (doEnsureSingleThread() && doSetupSelectorAndServerThread()) {
            int i = 0;
            int i2 = 5;
            while (!this.selectorthread.isInterrupted() && i2 != 0) {
                try {
                    try {
                        try {
                            try {
                                if (this.isclosed.get()) {
                                    i = 5;
                                }
                                if (this.selector.select(i) == 0 && this.isclosed.get()) {
                                    i2--;
                                }
                                Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                                selectionKey = null;
                                while (it.hasNext()) {
                                    try {
                                        SelectionKey next = it.next();
                                        try {
                                            if (next.isValid()) {
                                                if (next.isAcceptable()) {
                                                    doAccept(next, it);
                                                } else if ((!next.isReadable() || doRead(next, it)) && next.isWritable()) {
                                                    doWrite(next);
                                                }
                                            }
                                            selectionKey = next;
                                        } catch (IOException e) {
                                            e = e;
                                            selectionKey = next;
                                            handleIOException(selectionKey, null, e);
                                        } catch (WrappedIOException e2) {
                                            e = e2;
                                            selectionKey = next;
                                            handleIOException(selectionKey, e.getConnection(), e.getIOException());
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                    } catch (WrappedIOException e4) {
                                        e = e4;
                                    }
                                }
                                doAdditionalRead();
                            } catch (IOException e5) {
                                e = e5;
                                selectionKey = null;
                            } catch (WrappedIOException e6) {
                                e = e6;
                                selectionKey = null;
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (CancelledKeyException unused2) {
                        } catch (ClosedByInterruptException unused3) {
                            return;
                        }
                    } catch (RuntimeException e7) {
                        handleFatal(null, e7);
                    }
                } finally {
                    doServerShutdown();
                }
            }
        }
    }

    private void doAdditionalRead() throws InterruptedException, IOException {
        while (!this.iqueue.isEmpty()) {
            WebSocketImpl remove = this.iqueue.remove(0);
            WrappedByteChannel wrappedByteChannel = (WrappedByteChannel) remove.getChannel();
            ByteBuffer takeBuffer = takeBuffer();
            try {
                if (SocketChannelIOHelper.readMore(takeBuffer, remove, wrappedByteChannel)) {
                    this.iqueue.add(remove);
                }
                if (takeBuffer.hasRemaining()) {
                    remove.inQueue.put(takeBuffer);
                    queue(remove);
                } else {
                    pushBuffer(takeBuffer);
                }
            } catch (IOException e) {
                pushBuffer(takeBuffer);
                throw e;
            }
        }
    }

    private void doAccept(SelectionKey selectionKey, Iterator<SelectionKey> it) throws IOException, InterruptedException {
        if (!onConnect(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel accept = this.server.accept();
        if (accept == null) {
            return;
        }
        accept.configureBlocking(false);
        Socket socket = accept.socket();
        socket.setTcpNoDelay(isTcpNoDelay());
        socket.setKeepAlive(true);
        WebSocketImpl createWebSocket = this.wsf.createWebSocket((WebSocketAdapter) this, this.drafts);
        createWebSocket.setSelectionKey(accept.register(this.selector, 1, createWebSocket));
        try {
            createWebSocket.setChannel(this.wsf.wrapChannel(accept, createWebSocket.getSelectionKey()));
            it.remove();
            allocateBuffers(createWebSocket);
        } catch (IOException e) {
            if (createWebSocket.getSelectionKey() != null) {
                createWebSocket.getSelectionKey().cancel();
            }
            handleIOException(createWebSocket.getSelectionKey(), null, e);
        }
    }

    private boolean doRead(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, WrappedIOException {
        WebSocketImpl webSocketImpl = (WebSocketImpl) selectionKey.attachment();
        ByteBuffer takeBuffer = takeBuffer();
        if (webSocketImpl.getChannel() == null) {
            selectionKey.cancel();
            handleIOException(selectionKey, webSocketImpl, new IOException());
            return false;
        }
        try {
            if (SocketChannelIOHelper.read(takeBuffer, webSocketImpl, webSocketImpl.getChannel())) {
                if (takeBuffer.hasRemaining()) {
                    webSocketImpl.inQueue.put(takeBuffer);
                    queue(webSocketImpl);
                    it.remove();
                    if (!(webSocketImpl.getChannel() instanceof WrappedByteChannel) || !((WrappedByteChannel) webSocketImpl.getChannel()).isNeedRead()) {
                        return true;
                    }
                    this.iqueue.add(webSocketImpl);
                    return true;
                }
                pushBuffer(takeBuffer);
                return true;
            }
            pushBuffer(takeBuffer);
            return true;
        } catch (IOException e) {
            pushBuffer(takeBuffer);
            throw new WrappedIOException(webSocketImpl, e);
        }
    }

    private void doWrite(SelectionKey selectionKey) throws WrappedIOException {
        WebSocketImpl webSocketImpl = (WebSocketImpl) selectionKey.attachment();
        try {
            if (SocketChannelIOHelper.batch(webSocketImpl, webSocketImpl.getChannel()) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            throw new WrappedIOException(webSocketImpl, e);
        }
    }

    private boolean doSetupSelectorAndServerThread() {
        this.selectorthread.setName("WebSocketSelector-" + this.selectorthread.getId());
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            this.server = open;
            open.configureBlocking(false);
            ServerSocket socket = this.server.socket();
            socket.setReceiveBufferSize(16384);
            socket.setReuseAddress(isReuseAddr());
            socket.bind(this.address, getMaxPendingConnections());
            Selector open2 = Selector.open();
            this.selector = open2;
            ServerSocketChannel serverSocketChannel = this.server;
            serverSocketChannel.register(open2, serverSocketChannel.validOps());
            startConnectionLostTimer();
            Iterator<WebSocketWorker> it = this.decoders.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            onStart();
            return true;
        } catch (IOException e) {
            handleFatal(null, e);
            return false;
        }
    }

    private boolean doEnsureSingleThread() {
        synchronized (this) {
            if (this.selectorthread != null) {
                throw new IllegalStateException(getClass().getName() + " can only be started once.");
            }
            this.selectorthread = Thread.currentThread();
            return !this.isclosed.get();
        }
    }

    private void doServerShutdown() {
        stopConnectionLostTimer();
        List<WebSocketWorker> list = this.decoders;
        if (list != null) {
            Iterator<WebSocketWorker> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Selector selector = this.selector;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                this.log.error("IOException during selector.close", (Throwable) e);
                onError(null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.server;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                this.log.error("IOException during server.close", (Throwable) e2);
                onError(null, e2);
            }
        }
    }

    protected void allocateBuffers(WebSocket webSocket) throws InterruptedException {
        if (this.queuesize.get() >= (this.decoders.size() * 2) + 1) {
            return;
        }
        this.queuesize.incrementAndGet();
        this.buffers.put(createBuffer());
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(16384);
    }

    protected void queue(WebSocketImpl webSocketImpl) throws InterruptedException {
        if (webSocketImpl.getWorkerThread() == null) {
            List<WebSocketWorker> list = this.decoders;
            webSocketImpl.setWorkerThread(list.get(this.queueinvokes % list.size()));
            this.queueinvokes++;
        }
        webSocketImpl.getWorkerThread().put(webSocketImpl);
    }

    private ByteBuffer takeBuffer() throws InterruptedException {
        return this.buffers.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushBuffer(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.buffers.size() > this.queuesize.intValue()) {
            return;
        }
        this.buffers.put(byteBuffer);
    }

    private void handleIOException(SelectionKey selectionKey, WebSocket webSocket, IOException iOException) {
        SelectableChannel channel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (webSocket != null) {
            webSocket.closeConnection(1006, iOException.getMessage());
        } else {
            if (selectionKey == null || (channel = selectionKey.channel()) == null || !channel.isOpen()) {
                return;
            }
            try {
                channel.close();
            } catch (IOException unused) {
            }
            this.log.trace("Connection closed because of exception", (Throwable) iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFatal(WebSocket webSocket, Exception exc) {
        this.log.error("Shutdown due to fatal error", (Throwable) exc);
        onError(webSocket, exc);
        try {
            stop(0, "Got error on server side: " + exc.getClass().getName() + (exc.getCause() != null ? " caused by " + exc.getCause().getClass().getName() : ""));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.log.error("Interrupt during stop", (Throwable) exc);
            onError(null, e);
        }
        List<WebSocketWorker> list = this.decoders;
        if (list != null) {
            Iterator<WebSocketWorker> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.selectorthread;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(webSocket, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(webSocket, byteBuffer);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        if (addConnection(webSocket)) {
            onOpen(webSocket, (ClientHandshake) handshakedata);
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        this.selector.wakeup();
        try {
            if (removeConnection(webSocket)) {
                onClose(webSocket, i, str, z);
            }
        } finally {
            try {
                releaseBuffers(webSocket);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    protected boolean removeConnection(WebSocket webSocket) {
        boolean z;
        synchronized (this.connections) {
            if (this.connections.contains(webSocket)) {
                z = this.connections.remove(webSocket);
            } else {
                this.log.trace("Removing connection which is not in the connections collection! Possible no handshake received! {}", webSocket);
                z = false;
            }
        }
        if (this.isclosed.get() && this.connections.isEmpty()) {
            this.selectorthread.interrupt();
        }
        return z;
    }

    protected boolean addConnection(WebSocket webSocket) {
        boolean add;
        if (!this.isclosed.get()) {
            synchronized (this.connections) {
                add = this.connections.add(webSocket);
            }
            return add;
        }
        webSocket.close(1001);
        return true;
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(webSocket, exc);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
        WebSocketImpl webSocketImpl = (WebSocketImpl) webSocket;
        try {
            webSocketImpl.getSelectionKey().interestOps(5);
        } catch (CancelledKeyException unused) {
            webSocketImpl.outQueue.clear();
        }
        this.selector.wakeup();
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(webSocket, i, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(webSocket, i, str, z);
    }

    public final void setWebSocketFactory(WebSocketServerFactory webSocketServerFactory) {
        WebSocketServerFactory webSocketServerFactory2 = this.wsf;
        if (webSocketServerFactory2 != null) {
            webSocketServerFactory2.close();
        }
        this.wsf = webSocketServerFactory;
    }

    public final WebSocketFactory getWebSocketFactory() {
        return this.wsf;
    }

    private Socket getSocket(WebSocket webSocket) {
        return ((SocketChannel) ((WebSocketImpl) webSocket).getSelectionKey().channel()).socket();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) getSocket(webSocket).getLocalSocketAddress();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) getSocket(webSocket).getRemoteSocketAddress();
    }

    public void broadcast(String str) {
        broadcast(str, this.connections);
    }

    public void broadcast(byte[] bArr) {
        broadcast(bArr, this.connections);
    }

    public void broadcast(ByteBuffer byteBuffer) {
        broadcast(byteBuffer, this.connections);
    }

    public void broadcast(byte[] bArr, Collection<WebSocket> collection) {
        if (bArr == null || collection == null) {
            throw new IllegalArgumentException();
        }
        broadcast(ByteBuffer.wrap(bArr), collection);
    }

    public void broadcast(ByteBuffer byteBuffer, Collection<WebSocket> collection) {
        if (byteBuffer == null || collection == null) {
            throw new IllegalArgumentException();
        }
        doBroadcast(byteBuffer, collection);
    }

    public void broadcast(String str, Collection<WebSocket> collection) {
        if (str == null || collection == null) {
            throw new IllegalArgumentException();
        }
        doBroadcast(str, collection);
    }

    private void doBroadcast(Object obj, Collection<WebSocket> collection) {
        ArrayList<WebSocket> arrayList;
        String str = obj instanceof String ? (String) obj : null;
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (collection) {
            arrayList = new ArrayList(collection);
        }
        for (WebSocket webSocket : arrayList) {
            if (webSocket != null) {
                Draft draft = webSocket.getDraft();
                fillFrames(draft, hashMap, str, byteBuffer);
                try {
                    webSocket.sendFrame(hashMap.get(draft));
                } catch (WebsocketNotConnectedException unused) {
                }
            }
        }
    }

    private void fillFrames(Draft draft, Map<Draft, List<Framedata>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(draft)) {
            return;
        }
        List<Framedata> createFrames = str != null ? draft.createFrames(str, false) : null;
        if (byteBuffer != null) {
            createFrames = draft.createFrames(byteBuffer, false);
        }
        if (createFrames != null) {
            map.put(draft, createFrames);
        }
    }

    public class WebSocketWorker extends Thread {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private BlockingQueue<WebSocketImpl> iqueue = new LinkedBlockingQueue();

        public WebSocketWorker() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.java_websocket.server.WebSocketServer.WebSocketWorker.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    WebSocketServer.this.log.error("Uncaught exception in thread {}: {}", thread.getName(), th);
                }
            });
        }

        public void put(WebSocketImpl webSocketImpl) throws InterruptedException {
            this.iqueue.put(webSocketImpl);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WebSocketImpl webSocketImpl;
            Throwable th;
            Throwable e;
            while (true) {
                try {
                    try {
                        webSocketImpl = this.iqueue.take();
                        try {
                            doDecode(webSocketImpl, webSocketImpl.inQueue.poll());
                        } catch (LinkageError e2) {
                            e = e2;
                            WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                            WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                            return;
                        } catch (ThreadDeath e3) {
                            e = e3;
                            WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                            WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                            return;
                        } catch (VirtualMachineError e4) {
                            e = e4;
                            WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                            WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            WebSocketServer.this.log.error("Uncaught exception in thread {}: {}", getName(), th);
                            if (webSocketImpl != null) {
                                WebSocketServer.this.onWebsocketError(webSocketImpl, new Exception(th));
                                webSocketImpl.close();
                                return;
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (LinkageError e5) {
                    e = e5;
                    Throwable th3 = e;
                    webSocketImpl = null;
                    e = th3;
                    WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                    WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                    return;
                } catch (ThreadDeath e6) {
                    e = e6;
                    Throwable th32 = e;
                    webSocketImpl = null;
                    e = th32;
                    WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                    WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                    return;
                } catch (VirtualMachineError e7) {
                    e = e7;
                    Throwable th322 = e;
                    webSocketImpl = null;
                    e = th322;
                    WebSocketServer.this.log.error("Got fatal error in worker thread {}", getName());
                    WebSocketServer.this.handleFatal(webSocketImpl, new Exception(e));
                    return;
                } catch (Throwable th4) {
                    webSocketImpl = null;
                    th = th4;
                }
            }
        }

        private void doDecode(WebSocketImpl webSocketImpl, ByteBuffer byteBuffer) throws InterruptedException {
            try {
                try {
                    webSocketImpl.decode(byteBuffer);
                } catch (Exception e) {
                    WebSocketServer.this.log.error("Error while reading from remote connection", (Throwable) e);
                }
            } finally {
                WebSocketServer.this.pushBuffer(byteBuffer);
            }
        }
    }
}
