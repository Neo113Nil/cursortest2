package o;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.Bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052Bx implements InterfaceC0311Lx {
    public final InterfaceC1412l8 h;
    public final HashMap i = new HashMap();
    public final HashMap j;
    public final C0234Ix k;

    public C0052Bx(InterfaceC1412l8 interfaceC1412l8) {
        HashMap hashMap = new HashMap();
        this.j = hashMap;
        this.k = new C0234Ix();
        this.h = interfaceC1412l8;
        C0363Nx c0363Nx = AbstractC0415Px.a;
        C0389Ox c0389Ox = new C0389Ox();
        c0389Ox.a = false;
        C0389Ox c0389Ox2 = new C0389Ox[]{c0389Ox}[0];
        c0389Ox2.getClass();
        hashMap.put(4294967556L, c0389Ox2);
    }

    public final void a(C2320yx c2320yx, final C0260Jx c0260Jx) {
        long j;
        long j2;
        byte[] bArr = null;
        InterfaceC1346k8 interfaceC1346k8 = c0260Jx == null ? null : new InterfaceC1346k8() { // from class: o.zx
            @Override // o.InterfaceC1346k8
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                C0260Jx.this.a(bool.booleanValue());
            }
        };
        try {
            String str = c2320yx.g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(c2320yx.a);
            int i = c2320yx.b;
            if (i == 1) {
                j = 0;
            } else if (i == 2) {
                j = 1;
            } else {
                if (i != 3) {
                    throw null;
                }
                j = 2;
            }
            allocateDirect.putLong(j);
            allocateDirect.putLong(c2320yx.c);
            allocateDirect.putLong(c2320yx.d);
            allocateDirect.putLong(c2320yx.e ? 1L : 0L);
            int i2 = c2320yx.f;
            if (i2 == 1) {
                j2 = 0;
            } else if (i2 == 2) {
                j2 = 1;
            } else if (i2 == 3) {
                j2 = 2;
            } else if (i2 == 4) {
                j2 = 3;
            } else {
                if (i2 != 5) {
                    throw null;
                }
                j2 = 4;
            }
            allocateDirect.putLong(j2);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.h.g("flutter/keydata", allocateDirect, interfaceC1346k8);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z, Long l, Long l2, long j) {
        C2320yx c2320yx = new C2320yx();
        c2320yx.a = j;
        c2320yx.b = z ? 1 : 2;
        c2320yx.d = l.longValue();
        c2320yx.c = l2.longValue();
        c2320yx.g = null;
        c2320yx.e = true;
        c2320yx.f = 1;
        if (l2.longValue() != 0 && l.longValue() != 0) {
            if (!z) {
                l = null;
            }
            c(l2, l);
        }
        a(c2320yx, null);
    }

    public final void c(Long l, Long l2) {
        HashMap hashMap = this.i;
        if (l2 != null) {
            if (((Long) hashMap.put(l, l2)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d5  */
    @Override // o.InterfaceC0311Lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final KeyEvent keyEvent, C0260Jx c0260Jx) {
        Long l;
        boolean z;
        Long l2;
        int i;
        String str;
        int i2;
        int i3;
        C0389Ox c0389Ox;
        int i4;
        HashMap hashMap;
        int i5;
        HashMap hashMap2;
        Boolean[] boolArr;
        int i6;
        final long j;
        int i7;
        int i8;
        int i9;
        C0052Bx c0052Bx = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l = (Long) AbstractC0415Px.a.get(Long.valueOf(scanCode));
                if (l == null) {
                    l = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l;
            Long l4 = (Long) AbstractC0415Px.b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            C1143h2[] c1143h2Arr = AbstractC0415Px.c;
            int length = c1143h2Arr.length;
            int i10 = 0;
            while (true) {
                int i11 = 2;
                HashMap hashMap3 = c0052Bx.i;
                if (i10 >= length) {
                    HashMap hashMap4 = hashMap3;
                    Long l6 = l5;
                    HashMap hashMap5 = c0052Bx.j;
                    for (C0389Ox c0389Ox2 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        c0389Ox2.getClass();
                        boolean z2 = (metaState & 1048576) != 0;
                        if (4294967556L == l6.longValue() || c0389Ox2.a == z2) {
                            hashMap = hashMap4;
                        } else {
                            hashMap = hashMap4;
                            boolean containsKey = hashMap.containsKey(458809L);
                            boolean z3 = !containsKey;
                            if (!containsKey) {
                                c0389Ox2.a = !c0389Ox2.a;
                            }
                            c0052Bx.b(z3, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                c0389Ox2.a = !c0389Ox2.a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        c0052Bx = this;
                        hashMap4 = hashMap;
                    }
                    HashMap hashMap6 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z = true;
                    } else if (action != 1) {
                        c0052Bx = this;
                    } else {
                        z = false;
                    }
                    Long l7 = (Long) hashMap6.get(l3);
                    if (z) {
                        if (l7 == null) {
                            i4 = 1;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            i4 = 3;
                        } else {
                            c0052Bx = this;
                            l2 = l3;
                            c0052Bx.b(false, l7, l2, keyEvent.getEventTime());
                            i4 = 1;
                            char charValue = c0052Bx.k.a(keyEvent.getUnicodeChar()).charValue();
                            i = i4;
                            str = charValue == 0 ? "" + charValue : null;
                            i3 = 3;
                            i2 = 1;
                        }
                        c0052Bx = this;
                        l2 = l3;
                        char charValue2 = c0052Bx.k.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i = i4;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i3 = 3;
                        i2 = 1;
                    } else {
                        c0052Bx = this;
                        l2 = l3;
                        if (l7 != null) {
                            i = 2;
                            str = null;
                            i2 = 1;
                            i3 = 3;
                        }
                    }
                    if (i != i3) {
                        c0052Bx.c(l2, z ? l6 : null);
                    }
                    if (i == i2 && (c0389Ox = (C0389Ox) hashMap5.get(l6)) != null) {
                        c0389Ox.a = (c0389Ox.a ? 1 : 0) ^ i2;
                    }
                    C2320yx c2320yx = new C2320yx();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        c2320yx.f = 2;
                    } else if (source == 1025) {
                        c2320yx.f = i3;
                    } else if (source == 16777232) {
                        c2320yx.f = 4;
                    } else if (source != 33554433) {
                        c2320yx.f = 1;
                    } else {
                        c2320yx.f = 5;
                    }
                    c2320yx.a = keyEvent.getEventTime();
                    c2320yx.b = i;
                    c2320yx.d = l6.longValue();
                    c2320yx.c = l2.longValue();
                    c2320yx.g = str;
                    c2320yx.e = false;
                    c0052Bx.a(c2320yx, c0260Jx);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                C1143h2 c1143h2 = c1143h2Arr[i10];
                boolean z4 = (c1143h2.h & keyEvent.getMetaState()) != 0;
                long longValue = l5.longValue();
                long longValue2 = l3.longValue();
                C2241xk[] c2241xkArr = (C2241xk[]) c1143h2.i;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i12 = 0;
                boolean z5 = false;
                while (i12 < i11) {
                    final C2241xk c2241xk = c2241xkArr[i12];
                    boolean[] zArr2 = zArr;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(c2241xk.a));
                    zArr2[i12] = containsKey2;
                    Long l8 = l5;
                    if (c2241xk.b == longValue) {
                        boolean z6 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i8 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i9 = 2;
                        } else {
                            i8 = 1;
                            i9 = z6 ? 3 : 1;
                        }
                        int v = AbstractC1888sN.v(i9);
                        if (v == 0) {
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i6 = i12;
                            j = longValue2;
                            i7 = 2;
                            i5 = i10;
                            boolArr[i6] = Boolean.FALSE;
                            if (!z4) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: o.Ax
                                    public final /* synthetic */ C0052Bx i;

                                    {
                                        this.i = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                C0052Bx c0052Bx2 = this.i;
                                                c0052Bx2.getClass();
                                                c0052Bx2.b(false, Long.valueOf(c2241xk.b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                            default:
                                                C0052Bx c0052Bx3 = this.i;
                                                c0052Bx3.getClass();
                                                c0052Bx3.b(false, Long.valueOf(c2241xk.b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (v == i8) {
                            i5 = i10;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i6 = i12;
                            j = longValue2;
                            i7 = 2;
                            boolArr[i6] = Boolean.valueOf(zArr2[i6]);
                        } else if (v != 2) {
                            i5 = i10;
                            i7 = 2;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i6 = i12;
                            j = longValue2;
                        } else {
                            if (z4) {
                                i5 = i10;
                                i7 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                i6 = i12;
                                j = longValue2;
                            } else {
                                int i14 = i12;
                                final int i15 = 1;
                                i6 = i14;
                                i7 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                j = longValue2;
                                i5 = i10;
                                arrayList.add(new Runnable(this) { // from class: o.Ax
                                    public final /* synthetic */ C0052Bx i;

                                    {
                                        this.i = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                C0052Bx c0052Bx2 = this.i;
                                                c0052Bx2.getClass();
                                                c0052Bx2.b(false, Long.valueOf(c2241xk.b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                            default:
                                                C0052Bx c0052Bx3 = this.i;
                                                c0052Bx3.getClass();
                                                c0052Bx3.b(false, Long.valueOf(c2241xk.b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i6] = Boolean.valueOf(zArr2[i6]);
                        }
                        z5 = true;
                    } else {
                        i5 = i10;
                        hashMap2 = hashMap3;
                        boolArr = boolArr2;
                        i6 = i12;
                        j = longValue2;
                        i7 = 2;
                        z5 = z5 || containsKey2;
                    }
                    i12 = i6 + 1;
                    longValue2 = j;
                    i11 = i7;
                    boolArr2 = boolArr;
                    i10 = i5;
                    zArr = zArr2;
                    l5 = l8;
                    hashMap3 = hashMap2;
                }
                int i16 = i10;
                int i17 = i11;
                boolean[] zArr3 = zArr;
                Long l9 = l5;
                Boolean[] boolArr3 = boolArr2;
                if (z4) {
                    for (int i18 = 0; i18 < i17; i18++) {
                        if (boolArr3[i18] == null) {
                            if (z5) {
                                boolArr3[i18] = Boolean.valueOf(zArr3[i18]);
                            } else {
                                boolArr3[i18] = Boolean.TRUE;
                                z5 = true;
                            }
                        }
                    }
                    if (!z5) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i17; i19++) {
                        if (boolArr3[i19] == null) {
                            boolArr3[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i17; i20++) {
                    if (zArr3[i20] != boolArr3[i20].booleanValue()) {
                        C2241xk c2241xk2 = c2241xkArr[i20];
                        b(boolArr3[i20].booleanValue(), Long.valueOf(c2241xk2.b), Long.valueOf(c2241xk2.a), keyEvent.getEventTime());
                    }
                }
                c0052Bx = this;
                i10 = i16 + 1;
                l5 = l9;
            }
        }
        c0052Bx.b(true, 0L, 0L, 0L);
        c0260Jx.a(true);
    }
}
