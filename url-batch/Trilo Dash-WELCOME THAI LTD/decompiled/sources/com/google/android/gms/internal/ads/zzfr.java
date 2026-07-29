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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfr extends zzek {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzfr(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzfq {
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
                throw new zzfq(null, e, 2000);
            }
        }
        InputStream inputStream = this.zze;
        int i3 = zzeg.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zzf == -1) {
                return -1;
            }
            throw new zzfq("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zzf;
        if (j2 != -1) {
            this.zzf = j2 - read;
        }
        zzg(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzew zzewVar) throws zzfq {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = zzewVar.zza;
        this.zzc = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        Objects.requireNonNull(lastPathSegment);
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new zzfq("URI must either use scheme rawresource or android.resource", null, PointerIconCompat.TYPE_WAIT);
                    }
                    String path = uri.getPath();
                    Objects.requireNonNull(path);
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = this.zza.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.zzb);
                    if (parseInt == 0) {
                        throw new zzfq("Resource not found.", null, 2005);
                    }
                    zzi(zzewVar);
                    openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                    this.zzd = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new zzfq("Resource is compressed: ".concat(String.valueOf(String.valueOf(uri))), null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.zze = fileInputStream;
                    if (length != -1) {
                        try {
                            if (zzewVar.zzf > length) {
                                throw new zzfq(null, null, 2008);
                            }
                        } catch (zzfq e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new zzfq(null, e2, 2000);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(zzewVar.zzf + startOffset) - startOffset;
                    if (skip != zzewVar.zzf) {
                        throw new zzfq(null, null, 2008);
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
                                throw new zzfq(null, null, 2008);
                            }
                        }
                    } else {
                        j = length - skip;
                        this.zzf = j;
                        if (j < 0) {
                            throw new zzes(2008);
                        }
                    }
                    long j2 = zzewVar.zzg;
                    if (j2 != -1) {
                        if (j != -1) {
                            j2 = Math.min(j, j2);
                        }
                        this.zzf = j2;
                    }
                    this.zzg = true;
                    zzj(zzewVar);
                    long j3 = zzewVar.zzg;
                    return j3 != -1 ? j3 : this.zzf;
                }
                openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                this.zzd = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new zzfq(null, e3, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            Objects.requireNonNull(lastPathSegment2);
            parseInt = Integer.parseInt(lastPathSegment2);
            zzi(zzewVar);
        } catch (NumberFormatException unused) {
            throw new zzfq("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() throws zzfq {
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
                    throw new zzfq(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new zzfq(null, e2, 2000);
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
                    throw new zzfq(null, e3, 2000);
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
