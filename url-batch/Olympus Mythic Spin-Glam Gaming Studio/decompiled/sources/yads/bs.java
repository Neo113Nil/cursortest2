package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class bs implements cs {
    public final Cipher a = null;
    public final SecretKeySpec b = null;
    public final hj c;
    public boolean d;
    public kq2 e;

    public bs(File file) {
        this.c = new hj(file);
    }

    @Override // yads.cs
    public final void a(long j) {
    }

    @Override // yads.cs
    public final void b() {
        hj hjVar = this.c;
        hjVar.a.delete();
        hjVar.b.delete();
    }

    @Override // yads.cs
    public final boolean a() {
        hj hjVar = this.c;
        return hjVar.a.exists() || hjVar.b.exists();
    }

    @Override // yads.cs
    public final void a(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        int readInt;
        if (!this.d) {
            hj hjVar = this.c;
            if (hjVar.a.exists() || hjVar.b.exists()) {
                DataInputStream dataInputStream2 = null;
                try {
                    bufferedInputStream = new BufferedInputStream(this.c.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    readInt = dataInputStream.readInt();
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                        sb3.a(dataInputStream2);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    hj hjVar2 = this.c;
                    hjVar2.a.delete();
                    hjVar2.b.delete();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                        sb3.a(dataInputStream2);
                    }
                    throw th;
                }
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.a != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                Cipher cipher = this.a;
                                SecretKeySpec secretKeySpec = this.b;
                                int i = sb3.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.a));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i2 = 0;
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        zr a = a(readInt, dataInputStream);
                        hashMap.put(a.b, a);
                        sparseArray.put(a.a, a.b);
                        i2 += a(a, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i2 && z) {
                        sb3.a(dataInputStream);
                        return;
                    }
                    sb3.a(dataInputStream);
                    hashMap.clear();
                    sparseArray.clear();
                    hj hjVar22 = this.c;
                    hjVar22.a.delete();
                    hjVar22.b.delete();
                    return;
                }
                sb3.a(dataInputStream);
                hashMap.clear();
                sparseArray.clear();
                hj hjVar222 = this.c;
                hjVar222.a.delete();
                hjVar222.b.delete();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.cs
    public final void b(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        try {
            gj b = this.c.b();
            kq2 kq2Var = this.e;
            if (kq2Var == null) {
                this.e = new kq2(b);
            } else {
                kq2Var.a(b);
            }
            dataOutputStream = new DataOutputStream(this.e);
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (zr zrVar : hashMap.values()) {
                dataOutputStream.writeInt(zrVar.a);
                dataOutputStream.writeUTF(zrVar.b);
                Set<Map.Entry> entrySet = zrVar.e.b.entrySet();
                dataOutputStream.writeInt(entrySet.size());
                for (Map.Entry entry : entrySet) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    byte[] bArr = (byte[]) entry.getValue();
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                }
                i += a(zrVar, 2);
            }
            dataOutputStream.writeInt(i);
            hj hjVar = this.c;
            hjVar.getClass();
            dataOutputStream.close();
            hjVar.b.delete();
            int i2 = sb3.a;
            this.d = false;
        } catch (Throwable th2) {
            th = th2;
            sb3.a(dataOutputStream);
            throw th;
        }
    }

    @Override // yads.cs
    public final void a(HashMap hashMap) {
        if (this.d) {
            b(hashMap);
        }
    }

    @Override // yads.cs
    public final void a(zr zrVar) {
        this.d = true;
    }

    @Override // yads.cs
    public final void a(zr zrVar, boolean z) {
        this.d = true;
    }

    public static int a(zr zrVar, int i) {
        int hashCode = zrVar.b.hashCode() + (zrVar.a * 31);
        if (i < 2) {
            long a = lz.a(zrVar.e);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return (hashCode * 31) + zrVar.e.hashCode();
    }

    public static zr a(int i, DataInputStream dataInputStream) {
        zc0 a;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            mz mzVar = new mz();
            mzVar.a.put("exo_len", Long.valueOf(readLong));
            mzVar.b.remove("exo_len");
            a = zc0.c.a(mzVar);
        } else {
            a = ds.a(dataInputStream);
        }
        return new zr(readInt, readUTF, a);
    }
}
