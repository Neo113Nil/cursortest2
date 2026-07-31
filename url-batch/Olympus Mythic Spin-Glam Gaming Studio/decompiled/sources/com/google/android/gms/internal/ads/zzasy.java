package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.facebook.internal.security.OidcSecurityUtil;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzasy {
    public static X509Certificate[][] zza(String str) throws zzasv, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zza = zzasz.zza(randomAccessFile);
            if (zza == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzasv(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) zza.first;
            long longValue = ((Long) zza.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzasv("ZIP64 APK not supported");
                }
            }
            long zzb = zzasz.zzb(byteBuffer);
            if (zzb >= longValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 82 + String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(zzb);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new zzasv(sb2.toString());
            }
            if (zzasz.zzd(byteBuffer) + zzb != longValue) {
                throw new zzasv("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (zzb < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzb).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(zzb);
                throw new zzasv(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(zzb - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzasv("No APK Signing Block before ZIP Central Directory");
            }
            long j2 = allocate.getLong(0);
            if (j2 < allocate.capacity() || j2 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j2);
                throw new zzasv(sb4.toString());
            }
            int i = (int) (8 + j2);
            long j3 = zzb - i;
            if (j3 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j3).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j3);
                throw new zzasv(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j3);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j4 = allocate2.getLong(0);
            if (j4 != j2) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j4).length() + 63 + String.valueOf(j2).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j4);
                sb6.append(" vs ");
                sb6.append(j2);
                throw new zzasv(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j3));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            String str2 = "Insufficient data to read size of APK Signing Block entry #";
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < ");
                sb7.append(8);
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
                        sb9.append(str2);
                        sb9.append(i3);
                        throw new zzasv(sb9.toString());
                    }
                    long j5 = slice.getLong();
                    if (j5 < 4 || j5 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(j5).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i3);
                        sb10.append(" size out of range: ");
                        sb10.append(j5);
                        throw new zzasv(sb10.toString());
                    }
                    int i4 = (int) j5;
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
                        throw new zzasv(sb11.toString());
                    }
                    String str3 = str2;
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new zzasu(zzi(slice, i4 - 4), longValue2, zzb, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return zzb2;
                    }
                    slice.position(position2);
                    i2 = i3;
                    str2 = str3;
                }
                throw new zzasv("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzasu zzasuVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer zzj = zzj(zzasuVar.zza());
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
                zzd(hashMap, fileChannel, zzasuVar.zzb(), zzasuVar.zzc(), zzasuVar.zzd(), zzasuVar.zze());
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
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
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
            } catch (IOException e) {
                e = e;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 34);
                sb2.append("Failed to parse signature record #");
                sb2.append(i2);
                throw new SecurityException(sb2.toString(), e);
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
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
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
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create(OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256, null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
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
                } catch (IOException e3) {
                    e = e3;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 31);
                    sb3.append("Failed to parse digest record #");
                    sb3.append(i4);
                    throw new IOException(sb3.toString(), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    StringBuilder sb32 = new StringBuilder(String.valueOf(i4).length() + 31);
                    sb32.append("Failed to parse digest record #");
                    sb32.append(i4);
                    throw new IOException(sb32.toString(), e);
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
                    arrayList3.add(new zzasw((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzk2)), zzk2));
                } catch (CertificateException e5) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i6).length() + 30);
                    sb4.append("Failed to decode certificate #");
                    sb4.append(i6);
                    throw new SecurityException(sb4.toString(), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(zzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5.append("Failed to verify ");
            sb5.append(str2);
            sb5.append(" signature");
            throw new SecurityException(sb5.toString(), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            StringBuilder sb52 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52.append("Failed to verify ");
            sb52.append(str2);
            sb52.append(" signature");
            throw new SecurityException(sb52.toString(), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            StringBuilder sb522 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb522.append("Failed to verify ");
            sb522.append(str2);
            sb522.append(" signature");
            throw new SecurityException(sb522.toString(), e);
        } catch (SignatureException e9) {
            e = e9;
            StringBuilder sb5222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5222.append("Failed to verify ");
            sb5222.append(str2);
            sb5222.append(" signature");
            throw new SecurityException(sb5222.toString(), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            StringBuilder sb52222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52222.append("Failed to verify ");
            sb52222.append(str2);
            sb52222.append(" signature");
            throw new SecurityException(sb52222.toString(), e);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzast zzastVar = new zzast(fileChannel, 0L, j);
        zzast zzastVar2 = new zzast(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzasz.zzc(duplicate, j);
        zzasr zzasrVar = new zzasr(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] zze = zze(iArr, new zzass[]{zzastVar, zzastVar2, zzasrVar});
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

    private static byte[][] zze(int[] iArr, zzass[] zzassVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzassVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j3);
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
            int i5 = (int) j3;
            byte[] bArr2 = new byte[(zzh(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzl(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String zzg = zzg(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(zzg);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(zzg.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i) {
            zzass zzassVar = zzassVarArr[i7];
            long j4 = j2;
            int i10 = i7;
            long zza = zzassVar.zza();
            while (zza > j2) {
                int min = (int) Math.min(zza, j);
                zzl(min, bArr3, i2);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzassVar.zzb(messageDigestArr, j5, min);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int zzh = zzh(i13);
                        zzass zzassVar2 = zzassVar;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        byte[] bArr5 = bArr3;
                        int digest = messageDigest.digest(bArr4, (i8 * zzh) + 5, zzh);
                        if (digest != zzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i12++;
                        c = 5;
                        zzassVar = zzassVar2;
                        bArr3 = bArr5;
                    }
                    zzass zzassVar3 = zzassVar;
                    long j6 = min;
                    long j7 = j5 + j6;
                    zza -= j6;
                    i8++;
                    zzassVar = zzassVar3;
                    j2 = 0;
                    i2 = 1;
                    j4 = j7;
                    j = 1048576;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 37 + String.valueOf(i9).length());
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i8);
                    sb3.append(" of section #");
                    sb3.append(i9);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i9++;
            i7 = i10 + 1;
            j2 = 0;
            j = 1048576;
            i = 3;
            i2 = 1;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String zzg2 = zzg(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(zzg2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(zzg2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
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
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    private static String zzg(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
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
