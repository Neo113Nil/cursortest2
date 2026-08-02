package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0443Gx<E> implements Iterator<E> {
    public static byte[] A02;
    public int A00;
    public final /* synthetic */ AbstractC02076u<E> A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{48, Ascii.SI, Ascii.SUB, Ascii.CR, Ascii.RS, Ascii.VT, Ascii.SYN, 16, 17, 95, Ascii.SYN, Ascii.FF, 95, 17, 16, Ascii.VT, 95, Ascii.FF, 10, Ascii.SI, Ascii.SI, 16, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 95, Ascii.EM, 16, Ascii.CR, 95, Ascii.CR, Ascii.SUB, Ascii.RS, Ascii.ESC, 82, 16, 17, 19, 6, 95, Ascii.FS, 16, 19, 19, Ascii.SUB, Ascii.FS, Ascii.VT, Ascii.SYN, 16, 17};
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(A02(0, 51, 10));
    }

    public C0443Gx(AbstractC02076u abstractC02076u) {
        this.A01 = abstractC02076u;
    }

    /* renamed from: A04, reason: from getter */
    public final int getA00() {
        return this.A00;
    }

    public final void A05(int i) {
        this.A00 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            AbstractC02076u<E> abstractC02076u = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return abstractC02076u.get(i);
        }
        throw new NoSuchElementException();
    }
}
