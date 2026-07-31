package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class j2 implements t2 {
    public final d2 a;
    public final o3 b;
    public final boolean c;
    public final j0 d;

    public j2(o3 o3Var, j0 j0Var, d2 d2Var) {
        this.b = o3Var;
        j0Var.getClass();
        this.c = d2Var instanceof GeneratedMessageLite$ExtendableMessage;
        this.d = j0Var;
        this.a = d2Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        return ((t0) this.a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(Object obj, Object obj2) {
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        this.b.getClass();
        if (!n3Var.equals(((z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.getClass();
        n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.d.getClass();
        return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        this.b.getClass();
        ((z0) obj).unknownFields.e = false;
        this.d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(Object obj) {
        this.b.getClass();
        int hashCode = ((z0) obj).unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.getClass();
        return (hashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a.hashCode();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        o3 o3Var = this.b;
        Class cls = u2.a;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        n3 n3Var2 = ((z0) obj2).unknownFields;
        if (!n3Var2.equals(n3.f)) {
            n3Var = n3.a(n3Var, n3Var2);
        }
        z0Var.unknownFields = n3Var;
        if (this.c) {
            this.d.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n0Var.a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        int i = n3Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < n3Var.a; i3++) {
                int i4 = n3Var.b[i3] >>> 3;
                i2 += b0.a((s) n3Var.c[i3]) + b0.b(3) + b0.c(i4) + b0.b(2) + (b0.b(1) * 2);
            }
            n3Var.d = i2;
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        this.d.getClass();
        return i + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, c0 c0Var) {
        this.d.getClass();
        Iterator d = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            w0 w0Var = (w0) entry.getKey();
            if (w0Var.c.a() == k4.MESSAGE && !w0Var.d && !w0Var.e) {
                int i = w0Var.b;
                Object value = entry.getValue();
                c0Var.getClass();
                if (value instanceof s) {
                    c0Var.a.b(i, (s) value);
                } else {
                    c0Var.a.a(i, (d2) value);
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        n3Var.getClass();
        c0Var.getClass();
        if (q4.ASCENDING == q4.DESCENDING) {
            for (int i2 = n3Var.a - 1; i2 >= 0; i2--) {
                int i3 = n3Var.b[i2] >>> 3;
                Object obj2 = n3Var.c[i2];
                if (obj2 instanceof s) {
                    c0Var.a.b(i3, (s) obj2);
                } else {
                    c0Var.a.a(i3, (d2) obj2);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < n3Var.a; i4++) {
            int i5 = n3Var.b[i4] >>> 3;
            Object obj3 = n3Var.c[i4];
            if (obj3 instanceof s) {
                c0Var.a.b(i5, (s) obj3);
            } else {
                c0Var.a.a(i5, (d2) obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, byte[] bArr, int i, int i2, f fVar) {
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n0 ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        x0 x0Var = null;
        while (i < i2) {
            int d = g.d(bArr, i, fVar);
            int i3 = fVar.a;
            if (i3 == 11) {
                int i4 = 0;
                s sVar = null;
                while (true) {
                    if (d >= i2) {
                        break;
                    }
                    int i5 = d + 1;
                    byte b = bArr[d];
                    if (b >= 0) {
                        fVar.a = b;
                    } else {
                        i5 = g.a(b, bArr, i5, fVar);
                    }
                    int i6 = fVar.a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (x0Var != null) {
                                d = g.a(p2.c.a(x0Var.c.getClass()), bArr, i5, i2, fVar);
                                ensureExtensionsAreMutable.c(x0Var.d, fVar.c);
                            } else if (i8 == 2) {
                                d = g.a(bArr, i5, fVar);
                                sVar = (s) fVar.c;
                            }
                        }
                        if (i6 != 12) {
                            d = i5;
                            break;
                        }
                        d = g.a(i6, bArr, i5, i2, fVar);
                    } else if (i8 == 0) {
                        int i9 = i5 + 1;
                        byte b2 = bArr[i5];
                        if (b2 >= 0) {
                            fVar.a = b2;
                        } else {
                            i9 = g.a(b2, bArr, i9, fVar);
                        }
                        d = i9;
                        i4 = fVar.a;
                        j0 j0Var = this.d;
                        h0 h0Var = fVar.d;
                        d2 d2Var = this.a;
                        j0Var.getClass();
                        x0Var = h0Var.a(i4, d2Var);
                    } else if (i6 != 12) {
                    }
                }
                if (sVar != null) {
                    n3Var.a((i4 << 3) | 2, sVar);
                }
                i = d;
            } else if ((i3 & 7) == 2) {
                j0 j0Var2 = this.d;
                h0 h0Var2 = fVar.d;
                d2 d2Var2 = this.a;
                j0Var2.getClass();
                x0 a = h0Var2.a(i3 >>> 3, d2Var2);
                if (a != null) {
                    i = g.a(p2.c.a(a.c.getClass()), bArr, d, i2, fVar);
                    ensureExtensionsAreMutable.c(a.d, fVar.c);
                } else {
                    i = g.a(i3, bArr, d, i2, n3Var, fVar);
                }
                x0Var = a;
            } else {
                i = g.a(i3, bArr, d, i2, fVar);
            }
        }
        if (i != i2) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        o3 o3Var = this.b;
        j0 j0Var = this.d;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        j0Var.getClass();
        n0 ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        do {
            try {
                if (s2Var.s() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                z0Var.unknownFields = n3Var2;
            }
        } while (a(s2Var, h0Var, j0Var, ensureExtensionsAreMutable, o3Var, n3Var2));
    }

    public final boolean a(s2 s2Var, h0 h0Var, j0 j0Var, n0 n0Var, o3 o3Var, n3 n3Var) {
        byte[] bArr;
        int e = s2Var.e();
        if (e != 11) {
            if ((e & 7) == 2) {
                d2 d2Var = this.a;
                j0Var.getClass();
                x0 a = h0Var.a(e >>> 3, d2Var);
                if (a != null) {
                    n0Var.c(a.d, s2Var.b(a.c.getClass(), h0Var));
                    return true;
                }
                o3Var.getClass();
                return o3.a((Object) n3Var, s2Var);
            }
            return s2Var.i();
        }
        x0 x0Var = null;
        int i = 0;
        s sVar = null;
        while (s2Var.s() != Integer.MAX_VALUE) {
            int e2 = s2Var.e();
            if (e2 == 16) {
                i = s2Var.c();
                d2 d2Var2 = this.a;
                j0Var.getClass();
                x0Var = h0Var.a(i, d2Var2);
            } else if (e2 == 26) {
                if (x0Var != null) {
                    j0Var.getClass();
                    n0Var.c(x0Var.d, s2Var.b(x0Var.c.getClass(), h0Var));
                } else {
                    sVar = s2Var.a();
                }
            } else if (!s2Var.i()) {
                break;
            }
        }
        if (s2Var.e() != 12) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
        if (sVar != null) {
            if (x0Var != null) {
                j0Var.getClass();
                z0 b = ((t0) x0Var.c.newBuilderForType()).b();
                int size = sVar.size();
                if (size == 0) {
                    bArr = l1.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVar.a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                if (wrap.hasArray()) {
                    h hVar = new h(wrap);
                    p2 p2Var = p2.c;
                    p2Var.getClass();
                    p2Var.a(b.getClass()).a(b, hVar, h0Var);
                    n0Var.c(x0Var.d, b);
                    if (hVar.s() != Integer.MAX_VALUE) {
                        throw new n1("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
            } else {
                o3Var.getClass();
                n3Var.a((i << 3) | 2, sVar);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
