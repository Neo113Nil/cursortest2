package com.davidehrmann.vcdiff.mina_buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class CachedBufferAllocator implements IoBufferAllocator {
    private static final int DEFAULT_MAX_CACHED_BUFFER_SIZE = 262144;
    private static final int DEFAULT_MAX_POOL_SIZE = 8;
    private final ThreadLocal<Map<Integer, Queue<CachedBuffer>>> directBuffers;
    private final ThreadLocal<Map<Integer, Queue<CachedBuffer>>> heapBuffers;
    private final int maxCachedBufferSize;
    private final int maxPoolSize;

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public void dispose() {
    }

    public CachedBufferAllocator() {
        this(8, 262144);
    }

    public CachedBufferAllocator(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("maxPoolSize: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxCachedBufferSize: " + i2);
        }
        this.maxPoolSize = i;
        this.maxCachedBufferSize = i2;
        this.heapBuffers = new ThreadLocal<Map<Integer, Queue<CachedBuffer>>>() { // from class: com.davidehrmann.vcdiff.mina_buffer.CachedBufferAllocator.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Map<Integer, Queue<CachedBuffer>> initialValue() {
                return CachedBufferAllocator.this.newPoolMap();
            }
        };
        this.directBuffers = new ThreadLocal<Map<Integer, Queue<CachedBuffer>>>() { // from class: com.davidehrmann.vcdiff.mina_buffer.CachedBufferAllocator.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Map<Integer, Queue<CachedBuffer>> initialValue() {
                return CachedBufferAllocator.this.newPoolMap();
            }
        };
    }

    public int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public int getMaxCachedBufferSize() {
        return this.maxCachedBufferSize;
    }

    Map<Integer, Queue<CachedBuffer>> newPoolMap() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 31; i++) {
            hashMap.put(Integer.valueOf(1 << i), new ConcurrentLinkedQueue());
        }
        hashMap.put(0, new ConcurrentLinkedQueue());
        hashMap.put(Integer.MAX_VALUE, new ConcurrentLinkedQueue());
        return hashMap;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public IoBuffer allocate(int i, boolean z) {
        Queue<CachedBuffer> queue;
        IoBuffer wrap;
        int normalizeCapacity = IoBuffer.normalizeCapacity(i);
        int i2 = this.maxCachedBufferSize;
        if (i2 == 0 || normalizeCapacity <= i2) {
            if (z) {
                queue = this.directBuffers.get().get(Integer.valueOf(normalizeCapacity));
            } else {
                queue = this.heapBuffers.get().get(Integer.valueOf(normalizeCapacity));
            }
            CachedBuffer poll = queue.poll();
            if (poll != null) {
                poll.clear();
                poll.setAutoExpand(false);
                poll.order(ByteOrder.BIG_ENDIAN);
                wrap = poll;
            } else if (z) {
                wrap = wrap(ByteBuffer.allocateDirect(normalizeCapacity));
            } else {
                wrap = wrap(ByteBuffer.allocate(normalizeCapacity));
            }
        } else if (z) {
            wrap = wrap(ByteBuffer.allocateDirect(normalizeCapacity));
        } else {
            wrap = wrap(ByteBuffer.allocate(normalizeCapacity));
        }
        wrap.limit(i);
        return wrap;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public ByteBuffer allocateNioBuffer(int i, boolean z) {
        return allocate(i, z).buf();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public IoBuffer wrap(ByteBuffer byteBuffer) {
        return new CachedBuffer(byteBuffer);
    }

    private class CachedBuffer extends AbstractIoBuffer {
        private ByteBuffer buf;
        private final Thread ownerThread;

        protected CachedBuffer(ByteBuffer byteBuffer) {
            super(CachedBufferAllocator.this, byteBuffer.capacity());
            this.ownerThread = Thread.currentThread();
            this.buf = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        protected CachedBuffer(CachedBuffer cachedBuffer, ByteBuffer byteBuffer) {
            super(cachedBuffer);
            this.ownerThread = Thread.currentThread();
            this.buf = byteBuffer;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public ByteBuffer buf() {
            ByteBuffer byteBuffer = this.buf;
            if (byteBuffer != null) {
                return byteBuffer;
            }
            throw new IllegalStateException("Buffer has been freed already.");
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected void buf(ByteBuffer byteBuffer) {
            ByteBuffer byteBuffer2 = this.buf;
            this.buf = byteBuffer;
            free(byteBuffer2);
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer duplicate0() {
            return CachedBufferAllocator.this.new CachedBuffer(this, buf().duplicate());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer slice0() {
            return CachedBufferAllocator.this.new CachedBuffer(this, buf().slice());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer asReadOnlyBuffer0() {
            return CachedBufferAllocator.this.new CachedBuffer(this, buf().asReadOnlyBuffer());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public byte[] array() {
            return buf().array();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public int arrayOffset() {
            return buf().arrayOffset();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public boolean hasArray() {
            return buf().hasArray();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public void free() {
            free(this.buf);
            this.buf = null;
        }

        private void free(ByteBuffer byteBuffer) {
            if (byteBuffer != null) {
                if ((CachedBufferAllocator.this.maxCachedBufferSize == 0 || byteBuffer.capacity() <= CachedBufferAllocator.this.maxCachedBufferSize) && !byteBuffer.isReadOnly() && !isDerived() && Thread.currentThread() == this.ownerThread) {
                    Queue queue = byteBuffer.isDirect() ? (Queue) ((Map) CachedBufferAllocator.this.directBuffers.get()).get(Integer.valueOf(byteBuffer.capacity())) : (Queue) ((Map) CachedBufferAllocator.this.heapBuffers.get()).get(Integer.valueOf(byteBuffer.capacity()));
                    if (queue == null) {
                        return;
                    }
                    if (CachedBufferAllocator.this.maxPoolSize == 0 || queue.size() < CachedBufferAllocator.this.maxPoolSize) {
                        queue.offer(CachedBufferAllocator.this.new CachedBuffer(byteBuffer));
                    }
                }
            }
        }
    }
}
