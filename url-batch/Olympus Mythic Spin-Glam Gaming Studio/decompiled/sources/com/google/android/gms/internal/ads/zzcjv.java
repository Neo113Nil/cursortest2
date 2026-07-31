package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcjv extends zzcjs {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcjv(zzcif zzcifVar) {
        super(zzcifVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzgam.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzgam.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0401, code lost:
    
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0403, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x040b, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x040d, code lost:
    
        r0 = r15.format(r1);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r36).length());
        r3.append("Preloaded ");
        r3.append(r0);
        r3.append(" bytes from ");
        r3.append(r36);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x043f, code lost:
    
        r10.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0448, code lost:
    
        if (r0.isFile() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x044a, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0456, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8 A[LOOP:0: B:3:0x0022->B:13:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04bc  */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.text.DecimalFormat, java.text.NumberFormat] */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(final String str) {
        int i;
        int i2;
        File file;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        FileOutputStream fileOutputStream;
        String str7;
        FileOutputStream fileOutputStreamCtor;
        String str8;
        int i3;
        String str9;
        ReadableByteChannel readableByteChannel;
        int i4;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        ByteBuffer byteBuffer;
        FileChannel fileChannel;
        int i5;
        int i6;
        String str10;
        int httpUrlConnectionGetResponseCode;
        String str11;
        boolean delete;
        String str12 = " sec";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i = 0;
            } else {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = length;
                    File[] fileArr = listFiles;
                    if (listFiles[i7].getName().endsWith(".done")) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i8++;
                    }
                    i7 += i2;
                    listFiles = fileArr;
                    length = i9;
                }
                i = i8;
            }
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzy)).intValue()) {
                File file3 = this.zzg;
                if (file3 == null) {
                    str11 = str12;
                } else {
                    File[] listFiles2 = file3.listFiles();
                    int length2 = listFiles2.length;
                    long j = Long.MAX_VALUE;
                    int i10 = 0;
                    str11 = str12;
                    File file4 = null;
                    while (i10 < length2) {
                        File file5 = listFiles2[i10];
                        File[] fileArr2 = listFiles2;
                        int i11 = length2;
                        if (!file5.getName().endsWith(".done")) {
                            long lastModified = file5.lastModified();
                            if (lastModified < j) {
                                file4 = file5;
                                j = lastModified;
                            }
                        }
                        i10++;
                        listFiles2 = fileArr2;
                        length2 = i11;
                    }
                    if (file4 != null) {
                        delete = file4.delete();
                        File zza = zza(file4);
                        if (zza.isFile()) {
                            delete &= zza.delete();
                        }
                        if (delete) {
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                            zzq(str, null, "expireFailed", null);
                            return false;
                        }
                        str12 = str11;
                    }
                }
                delete = false;
                if (delete) {
                }
            } else {
                String str13 = str12;
                file = new File(zzgam.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
                File zza2 = zza(file);
                if (file.isFile() && zza2.isFile()) {
                    int length3 = (int) file.length();
                    String valueOf = String.valueOf(str);
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(valueOf));
                    zzo(str, file.getAbsolutePath(), length3);
                    return true;
                }
                String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
                String valueOf3 = String.valueOf(str);
                Set set = zze;
                String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str);
                            String sb2 = sb.toString();
                            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                            zzq(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        try {
                            str3 = "error";
                        } catch (IOException | RuntimeException e) {
                            e = e;
                            str2 = concat;
                            str3 = "error";
                        }
                        try {
                            HttpURLConnection zzh = zzgay.zza().zzh(new zzgba() { // from class: com.google.android.gms.internal.ads.zzcju
                                @Override // com.google.android.gms.internal.ads.zzgba
                                public final /* synthetic */ URLConnection zza() {
                                    int i15 = zzcjv.zzd;
                                    com.google.android.gms.ads.internal.zzt.zzq();
                                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzas)).intValue();
                                    URL url = new URL(str);
                                    int i16 = 0;
                                    while (true) {
                                        i16++;
                                        if (i16 > 20) {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                        int i17 = zzgat.zzb;
                                        URLConnection openConnection = url.openConnection();
                                        openConnection.setConnectTimeout(intValue);
                                        openConnection.setReadTimeout(intValue);
                                        if (!(openConnection instanceof HttpURLConnection)) {
                                            throw new IOException("Invalid protocol.");
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                        zzlVar.zza(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int httpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                        zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode2);
                                        if (httpUrlConnectionGetResponseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION);
                                        if (headerField == null) {
                                            throw new IOException("Missing Location header in redirect");
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            throw new IOException("Protocol is null");
                                        }
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            throw new IOException("Unsupported scheme: ".concat(protocol));
                                        }
                                        String concat2 = "Redirecting to ".concat(headerField);
                                        int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzd(concat2);
                                        AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (zzh != null && (httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(zzh)) >= 400) {
                                String str14 = "badUrl";
                                try {
                                    String num = Integer.toString(httpUrlConnectionGetResponseCode);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 27);
                                    sb3.append("HTTP request failed. Code: ");
                                    sb3.append(num);
                                    str5 = sb3.toString();
                                } catch (IOException | RuntimeException e2) {
                                    e = e2;
                                    str2 = concat;
                                    str4 = str14;
                                    str5 = null;
                                    str7 = str4;
                                    fileOutputStream = null;
                                    str6 = str7;
                                    if (e instanceof RuntimeException) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException | NullPointerException unused) {
                                    }
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str6, str5);
                                    zze.remove(str2);
                                    return false;
                                }
                                try {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(httpUrlConnectionGetResponseCode).length() + 21 + String.valueOf(str).length());
                                    sb4.append("HTTP status code ");
                                    sb4.append(httpUrlConnectionGetResponseCode);
                                    sb4.append(" at ");
                                    sb4.append(str);
                                    throw new IOException(sb4.toString());
                                } catch (IOException | RuntimeException e3) {
                                    e = e3;
                                    str2 = concat;
                                    str7 = str14;
                                    fileOutputStream = null;
                                    str6 = str7;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str6, str5);
                                    zze.remove(str2);
                                    return false;
                                }
                            }
                            int contentLength = zzh.getContentLength();
                            if (contentLength < 0) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 55);
                                sb5.append("Stream cache aborted, missing content-length header at ");
                                sb5.append(str);
                                String sb6 = sb5.toString();
                                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                                zzq(str, file.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(concat);
                                return false;
                            }
                            ?? r15 = zzf;
                            String format = r15.format(contentLength);
                            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzz)).intValue();
                            String str15 = "File too big for full file cache. Size: ";
                            if (contentLength > intValue) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str).length());
                                sb7.append("Content length ");
                                sb7.append(format);
                                sb7.append(" exceeds limit at ");
                                sb7.append(str);
                                String sb8 = sb7.toString();
                                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb8);
                                StringBuilder sb9 = new StringBuilder(String.valueOf(format).length() + 40);
                                sb9.append("File too big for full file cache. Size: ");
                                sb9.append(format);
                                zzq(str, file.getAbsolutePath(), "sizeExceeded", sb9.toString());
                                set.remove(concat);
                                return false;
                            }
                            StringBuilder sb10 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str).length());
                            sb10.append("Caching ");
                            sb10.append(format);
                            sb10.append(" bytes from ");
                            sb10.append(str);
                            String sb11 = sb10.toString();
                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb11);
                            ReadableByteChannel newChannel = Channels.newChannel(AdMobNetworkBridge.urlConnectionGetInputStream(zzh));
                            fileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
                            try {
                                FileChannel channel = fileOutputStreamCtor.getChannel();
                                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                                long currentTimeMillis = zzk.currentTimeMillis();
                                com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue());
                                long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue();
                                i3 = 0;
                                while (true) {
                                    int read = newChannel.read(allocate);
                                    if (read < 0) {
                                        break;
                                    }
                                    int i18 = read + i3;
                                    try {
                                        try {
                                            if (i18 > intValue) {
                                                String str16 = str15;
                                                String num2 = Integer.toString(i18);
                                                StringBuilder sb12 = new StringBuilder(String.valueOf(num2).length() + 40);
                                                sb12.append(str16);
                                                sb12.append(num2);
                                                sb12.toString();
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            try {
                                                allocate.flip();
                                                do {
                                                } while (channel.write(allocate) > 0);
                                                allocate.clear();
                                                if (zzk.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                    String l = Long.toString(longValue);
                                                    StringBuilder sb13 = new StringBuilder(String.valueOf(l).length() + 29);
                                                    sb13.append("Timeout exceeded. Limit: ");
                                                    sb13.append(l);
                                                    sb13.append(str13);
                                                    sb13.toString();
                                                    throw new IOException("stream cache time limit exceeded");
                                                }
                                                if (this.zzh) {
                                                    throw new IOException("abort requested");
                                                }
                                                if (zzbuVar2.zza()) {
                                                    i5 = intValue;
                                                    readableByteChannel = newChannel;
                                                    i4 = i18;
                                                    zzbuVar = zzbuVar2;
                                                    byteBuffer = allocate;
                                                    fileChannel = channel;
                                                    str9 = concat;
                                                    str10 = str15;
                                                    i6 = contentLength;
                                                    try {
                                                        try {
                                                            com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcjm(this, str, file.getAbsolutePath(), i4, contentLength, false));
                                                        } catch (IOException e4) {
                                                            e = e4;
                                                            str2 = str9;
                                                            fileOutputStream = fileOutputStreamCtor;
                                                            str8 = str3;
                                                            str5 = null;
                                                            str6 = str8;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                sb14.append("Preload aborted for URL \"");
                                                                sb14.append(str);
                                                                sb14.append("\"");
                                                                String sb15 = sb14.toString();
                                                                int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(sb15);
                                                            } else {
                                                                StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                sb16.append("Preload failed for URL \"");
                                                                sb16.append(str);
                                                                sb16.append("\"");
                                                                String sb17 = sb16.toString();
                                                                int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(sb17, e);
                                                            }
                                                            if (file.exists() && !file.delete()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str6, str5);
                                                            zze.remove(str2);
                                                            return false;
                                                        }
                                                    } catch (RuntimeException e5) {
                                                        e = e5;
                                                        str2 = str9;
                                                        fileOutputStream = fileOutputStreamCtor;
                                                        str8 = str3;
                                                        str5 = null;
                                                        str6 = str8;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                        }
                                                        if (file.exists()) {
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str6, str5);
                                                        zze.remove(str2);
                                                        return false;
                                                    }
                                                } else {
                                                    readableByteChannel = newChannel;
                                                    i4 = i18;
                                                    zzbuVar = zzbuVar2;
                                                    byteBuffer = allocate;
                                                    fileChannel = channel;
                                                    i5 = intValue;
                                                    str9 = concat;
                                                    i6 = contentLength;
                                                    str10 = str15;
                                                }
                                                str15 = str10;
                                                channel = fileChannel;
                                                intValue = i5;
                                                newChannel = readableByteChannel;
                                                i3 = i4;
                                                zzbuVar2 = zzbuVar;
                                                allocate = byteBuffer;
                                                concat = str9;
                                                contentLength = i6;
                                            } catch (IOException e6) {
                                                e = e6;
                                                str9 = concat;
                                                str2 = str9;
                                                fileOutputStream = fileOutputStreamCtor;
                                                str8 = str3;
                                                str5 = null;
                                                str6 = str8;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                }
                                                if (file.exists()) {
                                                }
                                                zzq(str, file.getAbsolutePath(), str6, str5);
                                                zze.remove(str2);
                                                return false;
                                            } catch (RuntimeException e7) {
                                                e = e7;
                                                str9 = concat;
                                                str2 = str9;
                                                fileOutputStream = fileOutputStreamCtor;
                                                str8 = str3;
                                                str5 = null;
                                                str6 = str8;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                }
                                                if (file.exists()) {
                                                }
                                                zzq(str, file.getAbsolutePath(), str6, str5);
                                                zze.remove(str2);
                                                return false;
                                            }
                                        } catch (IOException | RuntimeException e8) {
                                            e = e8;
                                            fileOutputStream = fileOutputStreamCtor;
                                            str2 = str9;
                                            str8 = r15;
                                            str5 = null;
                                            str6 = str8;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzq(str, file.getAbsolutePath(), str6, str5);
                                            zze.remove(str2);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e9) {
                                        e = e9;
                                        str5 = concat;
                                        fileOutputStream = fileOutputStreamCtor;
                                        str2 = str9;
                                        str6 = r15;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzq(str, file.getAbsolutePath(), str6, str5);
                                        zze.remove(str2);
                                        return false;
                                    }
                                }
                            } catch (IOException | RuntimeException e10) {
                                e = e10;
                                str2 = concat;
                            }
                        } catch (IOException | RuntimeException e11) {
                            e = e11;
                            str2 = concat;
                            str4 = str3;
                            str5 = null;
                            str7 = str4;
                            fileOutputStream = null;
                            str6 = str7;
                            if (e instanceof RuntimeException) {
                            }
                            fileOutputStream.close();
                            if (this.zzh) {
                            }
                            if (file.exists()) {
                            }
                            zzq(str, file.getAbsolutePath(), str6, str5);
                            zze.remove(str2);
                            return false;
                        }
                    } finally {
                    }
                }
            }
        }
        zzo(str, file.getAbsolutePath(), i3);
        str2 = str9;
        try {
            zze.remove(str2);
            return true;
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = fileOutputStreamCtor;
            str8 = str3;
            str5 = null;
            str6 = str8;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzq(str, file.getAbsolutePath(), str6, str5);
            zze.remove(str2);
            return false;
        } catch (RuntimeException e13) {
            e = e13;
            fileOutputStream = fileOutputStreamCtor;
            str8 = str3;
            str5 = null;
            str6 = str8;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzq(str, file.getAbsolutePath(), str6, str5);
            zze.remove(str2);
            return false;
        }
    }
}
