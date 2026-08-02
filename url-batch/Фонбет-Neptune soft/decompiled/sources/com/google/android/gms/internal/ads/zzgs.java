package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgs extends zzfl {
    private final Context zza;
    private zzfy zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgs(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static int zzk(String str) throws zzgr {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgr("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzfy zzfyVar) throws zzgr {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzfyVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzgr("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new zzgr("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, PointerIconCompat.TYPE_WAIT);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzgr("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzgr("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgr("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e2) {
            throw new zzgr(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzgr {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgr(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zzd;
        int i3 = zzet.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgr("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) throws zzgr {
        long j;
        this.zzb = zzfyVar;
        zzi(zzfyVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzfyVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzfyVar.zze > length) {
                    throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            } catch (zzgr e) {
                throw e;
            } catch (IOException e2) {
                throw new zzgr(null, e2, AdError.SERVER_ERROR_CODE);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzfyVar.zze + startOffset) - startOffset;
        if (skip != zzfyVar.zze) {
            throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new zzft(AdError.REMOTE_ADS_SERVICE_ERROR);
            }
        }
        long j2 = zzfyVar.zzf;
        if (j2 != -1) {
            if (j != -1) {
                j2 = Math.min(j, j2);
            }
            this.zze = j2;
        }
        this.zzf = true;
        zzj(zzfyVar);
        long j3 = zzfyVar.zzf;
        return j3 != -1 ? j3 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        zzfy zzfyVar = this.zzb;
        if (zzfyVar != null) {
            return zzfyVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() throws zzgr {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzgr(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } catch (IOException e2) {
                    throw new zzgr(null, e2, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzgr(null, e3, AdError.SERVER_ERROR_CODE);
            }
        }
    }
}
