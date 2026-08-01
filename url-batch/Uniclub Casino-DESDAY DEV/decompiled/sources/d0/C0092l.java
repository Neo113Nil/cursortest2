package d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1901b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1902c;
    public final long d;

    public C0092l(int i, int i2, long j2, long j3) {
        this.f1900a = i;
        this.f1901b = i2;
        this.f1902c = j2;
        this.d = j3;
    }

    public static C0092l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0092l c0092l = new C0092l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0092l;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1900a);
            dataOutputStream.writeInt(this.f1901b);
            dataOutputStream.writeLong(this.f1902c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0092l)) {
            return false;
        }
        C0092l c0092l = (C0092l) obj;
        return this.f1901b == c0092l.f1901b && this.f1902c == c0092l.f1902c && this.f1900a == c0092l.f1900a && this.d == c0092l.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1901b), Long.valueOf(this.f1902c), Integer.valueOf(this.f1900a), Long.valueOf(this.d));
    }
}
