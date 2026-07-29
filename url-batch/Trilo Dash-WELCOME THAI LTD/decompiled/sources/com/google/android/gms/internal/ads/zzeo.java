package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeo extends zzek {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzeo(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzen {
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
                throw new zzen(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i3 = zzeg.zza;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) throws zzen {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            Uri uri = zzewVar.zza;
            this.zzb = uri;
            zzi(zzewVar);
            if ("content".equals(zzewVar.zza.getScheme())) {
                Bundle bundle = new Bundle();
                if (zzeg.zza >= 31) {
                    zzem.zza(bundle);
                }
                openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
            }
            this.zzc = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new zzen(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.zzd = fileInputStream;
            if (length != -1 && zzewVar.zzf > length) {
                throw new zzen(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(zzewVar.zzf + startOffset) - startOffset;
            if (skip != zzewVar.zzf) {
                throw new zzen(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.zze = -1L;
                    j = -1;
                } else {
                    j = size - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzen(null, 2008);
                    }
                }
            } else {
                long j2 = length - skip;
                this.zze = j2;
                if (j2 < 0) {
                    throw new zzen(null, 2008);
                }
                j = j2;
            }
            long j3 = zzewVar.zzg;
            if (j3 != -1) {
                if (j != -1) {
                    j3 = Math.min(j, j3);
                }
                this.zze = j3;
            }
            this.zzf = true;
            zzj(zzewVar);
            long j4 = zzewVar.zzg;
            return j4 != -1 ? j4 : this.zze;
        } catch (zzen e) {
            throw e;
        } catch (IOException e2) {
            throw new zzen(e2, true == (e2 instanceof FileNotFoundException) ? 2005 : 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() throws zzen {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    }
                } catch (IOException e) {
                    throw new zzen(e, 2000);
                }
            } catch (IOException e2) {
                throw new zzen(e2, 2000);
            }
        } catch (Throwable th) {
            this.zzd = null;
            try {
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
                    throw th;
                } catch (IOException e3) {
                    throw new zzen(e3, 2000);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
