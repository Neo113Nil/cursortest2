package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.facebook.internal.security.OidcSecurityUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaon {
    public static X509Certificate[][] zza(String str) throws zzaok, SecurityException, IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair zza = zzaoo.zza(randomAccessFile2);
            try {
                if (zza == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new zzaok(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) zza.first;
                long longValue = ((Long) zza.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzaok("ZIP64 APK not supported");
                    }
                }
                long zzb = zzaoo.zzb(byteBuffer);
                if (zzb >= longValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 82 + String.valueOf(longValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(zzb);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(longValue);
                    throw new zzaok(sb2.toString());
                }
                if (zzaoo.zzd(byteBuffer) + zzb != longValue) {
                    throw new zzaok("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (zzb < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzb).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(zzb);
                    throw new zzaok(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile2.seek(zzb - allocate.capacity());
                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaok("No APK Signing Block before ZIP Central Directory");
                }
                long j2 = allocate.getLong(0);
                if (j2 < allocate.capacity() || j2 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j2);
                    throw new zzaok(sb4.toString());
                }
                int i = (int) (8 + j2);
                long j3 = zzb - i;
                if (j3 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j3).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j3);
                    throw new zzaok(sb5.toString());
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile2.seek(j3);
                long j4 = zzb;
                randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                long j5 = allocate2.getLong(0);
                if (j5 != j2) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j5).length() + 63 + String.valueOf(j2).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j5);
                    sb6.append(" vs ");
                    sb6.append(j2);
                    throw new zzaok(sb6.toString());
                }
                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                long longValue2 = ((Long) create.second).longValue();
                if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int capacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (capacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(capacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int capacity2 = byteBuffer2.capacity();
                if (capacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(capacity);
                    sb8.append(" > ");
                    sb8.append(capacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int limit = byteBuffer2.limit();
                int position = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(capacity);
                    byteBuffer2.position(8);
                    ByteBuffer slice = byteBuffer2.slice();
                    slice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    int i2 = 0;
                    while (slice.hasRemaining()) {
                        int i3 = i2 + 1;
                        if (slice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i3);
                            throw new zzaok(sb9.toString());
                        }
                        long j6 = slice.getLong();
                        if (j6 < 4 || j6 > SieveCacheKt.NodeLinkMask) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(j6).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i3);
                            sb10.append(" size out of range: ");
                            sb10.append(j6);
                            throw new zzaok(sb10.toString());
                        }
                        int i4 = (int) j6;
                        int position2 = slice.position() + i4;
                        if (i4 > slice.remaining()) {
                            int remaining = slice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(i4).length() + 13 + String.valueOf(remaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i3);
                            sb11.append(" size out of range: ");
                            sb11.append(i4);
                            sb11.append(", available: ");
                            sb11.append(remaining);
                            throw new zzaok(sb11.toString());
                        }
                        if (slice.getInt() == 1896449818) {
                            X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new zzaoj(zzi(slice, i4 - 4), longValue2, j4, longValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return zzb2;
                        }
                        long j7 = longValue2;
                        long j8 = j4;
                        slice.position(position2);
                        i2 = i3;
                        j4 = j8;
                        longValue2 = j7;
                    }
                    throw new zzaok("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzaoj zzaojVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer zzj = zzj(zzaojVar.zza());
                int i = 0;
                while (zzj.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzc(zzj(zzj), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(hashMap, fileChannel, zzaojVar.zzb(), zzaojVar.zzc(), zzaojVar.zzd(), zzaojVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzf(r6);
        r12 = zzf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair create;
        ByteBuffer zzj = zzj(byteBuffer);
        ByteBuffer zzj2 = zzj(byteBuffer);
        byte[] zzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (zzj2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer zzj3 = zzj(zzj2);
                if (zzj3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = zzj3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzk(zzj3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String hexString = Long.toHexString(i);
                    String.valueOf(hexString);
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(hexString)));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create(OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256, null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    String hexString2 = Long.toHexString(i);
                    String.valueOf(hexString2);
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(hexString2)));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzj);
            if (!signature.verify(bArr2)) {
                String.valueOf(str2);
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            zzj.clear();
            ByteBuffer zzj4 = zzj(zzj);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (zzj4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer zzj5 = zzj(zzj4);
                    if (zzj5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = zzj5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr = zzk(zzj5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 31);
                    sb2.append("Failed to parse digest record #");
                    sb2.append(i4);
                    throw new IOException(sb2.toString(), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzf = zzf(i);
            byte[] bArr3 = (byte[]) map.put(Integer.valueOf(zzf), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(zzg(zzf).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer zzj6 = zzj(zzj);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (zzj6.hasRemaining()) {
                i6++;
                byte[] zzk2 = zzk(zzj6);
                try {
                    arrayList3.add(new zzaol((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzk2)), zzk2));
                } catch (CertificateException e3) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 30);
                    sb3.append("Failed to decode certificate #");
                    sb3.append(i6);
                    throw new SecurityException(sb3.toString(), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(zzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str2);
            sb4.append(" signature");
            throw new SecurityException(sb4.toString(), e4);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaoi zzaoiVar = new zzaoi(fileChannel, 0L, j);
        zzaoi zzaoiVar2 = new zzaoi(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaoo.zzc(duplicate, j);
        zzaog zzaogVar = new zzaog(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] zze = zze(iArr, new zzaoh[]{zzaoiVar, zzaoiVar2, zzaogVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zze[i2])) {
                    throw new SecurityException(zzg(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] zze(int[] iArr, zzaoh[] zzaohVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        String str;
        int i3 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            j2 += (zzaohVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j2 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j2);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) j2;
            byte[] bArr2 = new byte[(zzh(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzl(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String zzg = zzg(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(zzg);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(zzg.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i) {
            zzaoh zzaohVar = zzaohVarArr[i7];
            int i10 = i7;
            long zza = zzaohVar.zza();
            long j3 = 0;
            while (zza > 0) {
                int i11 = i8;
                String str2 = str;
                int min = (int) Math.min(zza, j);
                zzl(min, bArr3, i2);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr3);
                }
                try {
                    zzaohVar.zzb(messageDigestArr, j3, min);
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr4 = bArr[i13];
                        int zzh = zzh(i14);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        int digest = messageDigest.digest(bArr4, (i11 * zzh) + 5, zzh);
                        if (digest != zzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i13++;
                        c = c2;
                    }
                    long j4 = min;
                    j3 += j4;
                    zza -= j4;
                    i8 = i11 + 1;
                    str = str2;
                    j = 1048576;
                    i2 = 1;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 37 + String.valueOf(i9).length());
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i11);
                    sb3.append(" of section #");
                    sb3.append(i9);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i9++;
            i7 = i10 + 1;
            j = 1048576;
            i = 3;
            i2 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr6 = bArr[i15];
            String zzg2 = zzg(i16);
            try {
                bArr5[i15] = MessageDigest.getInstance(zzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(zzg2.concat(str3), e3);
            }
        }
        return bArr5;
    }

    private static int zzf(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String hexString = Long.toHexString(i);
                String.valueOf(hexString);
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(hexString)));
        }
    }

    private static String zzg(int i) {
        if (i == 1) {
            return MessageDigestAlgorithms.SHA_256;
        }
        if (i == 2) {
            return MessageDigestAlgorithms.SHA_512;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int zzh(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(String.valueOf(remaining).length() + 82);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i);
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining2).length());
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length());
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    private static void zzl(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
