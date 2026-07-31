package com.davidehrmann.vcdiff.mina_buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class SimpleBufferAllocator implements IoBufferAllocator {
    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public void dispose() {
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public IoBuffer allocate(int i, boolean z) {
        return wrap(allocateNioBuffer(i, z));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public ByteBuffer allocateNioBuffer(int i, boolean z) {
        if (z) {
            return ByteBuffer.allocateDirect(i);
        }
        return ByteBuffer.allocate(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBufferAllocator
    public IoBuffer wrap(ByteBuffer byteBuffer) {
        return new SimpleBuffer(byteBuffer);
    }

    private class SimpleBuffer extends AbstractIoBuffer {
        private ByteBuffer buf;

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public void free() {
        }

        protected SimpleBuffer(ByteBuffer byteBuffer) {
            super(SimpleBufferAllocator.this, byteBuffer.capacity());
            this.buf = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        protected SimpleBuffer(SimpleBuffer simpleBuffer, ByteBuffer byteBuffer) {
            super(simpleBuffer);
            this.buf = byteBuffer;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public ByteBuffer buf() {
            return this.buf;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected void buf(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer duplicate0() {
            return SimpleBufferAllocator.this.new SimpleBuffer(this, this.buf.duplicate());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer slice0() {
            return SimpleBufferAllocator.this.new SimpleBuffer(this, this.buf.slice());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer
        protected IoBuffer asReadOnlyBuffer0() {
            return SimpleBufferAllocator.this.new SimpleBuffer(this, this.buf.asReadOnlyBuffer());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public byte[] array() {
            return this.buf.array();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public int arrayOffset() {
            return this.buf.arrayOffset();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
        public boolean hasArray() {
            return this.buf.hasArray();
        }
    }
}
