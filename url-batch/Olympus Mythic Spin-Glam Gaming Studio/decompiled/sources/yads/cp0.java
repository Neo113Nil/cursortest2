package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class cp0 implements d53 {
    public final g53 a = new g53();
    public final ArrayDeque b = new ArrayDeque();
    public int c;
    public boolean d;

    public cp0() {
        for (int i = 0; i < 2; i++) {
            this.b.addFirst(new ap0(this));
        }
        this.c = 0;
    }

    @Override // yads.d53
    public final void a(long j) {
    }

    @Override // yads.bb0
    public final void a(g53 g53Var) {
        if (this.d) {
            throw new IllegalStateException();
        }
        if (this.c != 1) {
            throw new IllegalStateException();
        }
        if (this.a != g53Var) {
            throw new IllegalArgumentException();
        }
        this.c = 2;
    }

    @Override // yads.bb0
    public final Object b() {
        if (this.d) {
            throw new IllegalStateException();
        }
        if (this.c != 0) {
            return null;
        }
        this.c = 1;
        return this.a;
    }

    @Override // yads.bb0
    public final void flush() {
        if (this.d) {
            throw new IllegalStateException();
        }
        this.a.b();
        this.c = 0;
    }

    @Override // yads.bb0
    public final void release() {
        this.d = true;
    }

    @Override // yads.bb0
    public final h53 a() {
        if (!this.d) {
            if (this.c != 2 || this.b.isEmpty()) {
                return null;
            }
            h53 h53Var = (h53) this.b.removeFirst();
            if (this.a.b(4)) {
                h53Var.b |= 4;
            } else {
                g53 g53Var = this.a;
                long j = g53Var.f;
                ByteBuffer byteBuffer = g53Var.d;
                byteBuffer.getClass();
                byte[] array = byteBuffer.array();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                obtain.recycle();
                ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                parcelableArrayList.getClass();
                bp0 bp0Var = new bp0(j, oq.a(s20.t, parcelableArrayList));
                h53Var.c = this.a.f;
                h53Var.d = bp0Var;
                h53Var.e = 0L;
            }
            this.a.b();
            this.c = 0;
            return h53Var;
        }
        throw new IllegalStateException();
    }

    public final void a(h53 h53Var) {
        if (this.b.size() < 2) {
            if (!this.b.contains(h53Var)) {
                h53Var.b = 0;
                h53Var.d = null;
                this.b.addFirst(h53Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
