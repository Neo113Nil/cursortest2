package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.HandlerWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;

    @GuardedBy
    private static final List<SystemMessage> messagePool = new ArrayList(50);
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i) {
        Assertions.checkArgument(i != 0);
        return this.handler.hasMessages(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, obj), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i) {
        return this.handler.sendEmptyMessage(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.handler.sendEmptyMessageDelayed(i, i2);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.handler.sendEmptyMessageAtTime(i, j);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeMessages(int i) {
        Assertions.checkArgument(i != 0);
        this.handler.removeMessages(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    private static SystemMessage obtainSystemMessage() {
        SystemMessage remove;
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    remove = new SystemMessage();
                } else {
                    remove = list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(SystemMessage systemMessage) {
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(systemMessage);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final class SystemMessage implements HandlerWrapper.Message {

        @Nullable
        private SystemHandlerWrapper handler;

        @Nullable
        private Message message;

        private SystemMessage() {
        }

        public SystemMessage setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.message));
            recycle();
            return sendMessageAtFrontOfQueue;
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.message)).sendToTarget();
            recycle();
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.handler);
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            SystemHandlerWrapper.recycleMessage(this);
        }
    }
}
