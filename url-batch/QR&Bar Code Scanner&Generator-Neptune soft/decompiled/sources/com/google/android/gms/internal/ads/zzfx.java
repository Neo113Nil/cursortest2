package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfx extends zzer {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzfx(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfw(null, e, 2000);
            }
        }
        InputStream inputStream = this.zze;
        int i3 = zzen.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zzf == -1) {
                return -1;
            }
            throw new zzfw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zzf;
        if (j2 != -1) {
            this.zzf = j2 - read;
        }
        zzg(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r3.matches("\\d+") != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    @Override // com.google.android.gms.internal.ads.zzex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzfc zzfcVar) throws zzfw {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = zzfcVar.zza;
        this.zzc = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        Objects.requireNonNull(lastPathSegment);
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new zzfw("URI must either use scheme rawresource or android.resource", null, PointerIconCompat.TYPE_WAIT);
                    }
                    String path = uri.getPath();
                    Objects.requireNonNull(path);
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = this.zza.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.zzb);
                    if (parseInt == 0) {
                        throw new zzfw("Resource not found.", null, 2005);
                    }
                    zzi(zzfcVar);
                    openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                    this.zzd = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new zzfw("Resource is compressed: ".concat(String.valueOf(String.valueOf(uri))), null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.zze = fileInputStream;
                    if (length != -1) {
                        try {
                            if (zzfcVar.zzf > length) {
                                throw new zzfw(null, null, 2008);
                            }
                        } catch (zzfw e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new zzfw(null, e2, 2000);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(zzfcVar.zzf + startOffset) - startOffset;
                    if (skip != zzfcVar.zzf) {
                        throw new zzfw(null, null, 2008);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.zzf = -1L;
                            j = -1;
                        } else {
                            j = channel.size() - channel.position();
                            this.zzf = j;
                            if (j < 0) {
                                throw new zzfw(null, null, 2008);
                            }
                        }
                    } else {
                        j = length - skip;
                        this.zzf = j;
                        if (j < 0) {
                            throw new zzey(2008);
                        }
                    }
                    long j2 = zzfcVar.zzg;
                    if (j2 != -1) {
                        if (j != -1) {
                            j2 = Math.min(j, j2);
                        }
                        this.zzf = j2;
                    }
                    this.zzg = true;
                    zzj(zzfcVar);
                    long j3 = zzfcVar.zzg;
                    return j3 != -1 ? j3 : this.zzf;
                }
                openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                this.zzd = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new zzfw(null, e3, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            Objects.requireNonNull(lastPathSegment2);
            parseInt = Integer.parseInt(lastPathSegment2);
            zzi(zzfcVar);
        } catch (NumberFormatException unused) {
            throw new zzfw("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws zzfw {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                    }
                } catch (IOException e) {
                    throw new zzfw(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new zzfw(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.zze = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzfw(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
