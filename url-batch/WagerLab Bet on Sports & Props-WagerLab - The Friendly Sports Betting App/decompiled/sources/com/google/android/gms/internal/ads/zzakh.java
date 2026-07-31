package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzakh implements zzajv {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, MessagePack.Code.UINT8, MessagePack.Code.ARRAY32, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzaka zzg;
    private final zzajz zzh;
    private final zzakg zzi;
    private Bitmap zzj;

    public zzakh(List list) {
        zzef zzefVar = new zzef((byte[]) list.get(0));
        int zzt = zzefVar.zzt();
        int zzt2 = zzefVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzaka(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.zzh = new zzajz(0, zzd(), zze(), zzf());
        this.zzi = new zzakg(zzt, zzt2);
    }

    private static zzajz zzb(zzee zzeeVar, int i) {
        int zzj;
        int zzj2;
        int i2;
        int i3;
        int i4 = 8;
        int zzj3 = zzeeVar.zzj(8);
        zzeeVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzj4 = zzeeVar.zzj(i4);
            int zzj5 = zzeeVar.zzj(i4);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i2 = zzeeVar.zzj(i4);
                i3 = zzeeVar.zzj(i4);
                zzj = zzeeVar.zzj(i4);
                zzj2 = zzeeVar.zzj(i4);
                i5 -= 6;
            } else {
                int zzj6 = zzeeVar.zzj(6) << 2;
                int zzj7 = zzeeVar.zzj(4) << 4;
                i5 -= 4;
                zzj = zzeeVar.zzj(4) << 4;
                zzj2 = zzeeVar.zzj(2) << 6;
                i2 = zzj6;
                i3 = zzj7;
            }
            if (i2 == 0) {
                zzj2 = 255;
            }
            if (i2 == 0) {
                zzj = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            double d = i2;
            String str = zzeo.zza;
            double d2 = i3 - 128;
            double d3 = zzj - 128;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzj3 = zzj3;
            i4 = 8;
        }
        return new zzajz(zzj3, zzd, zze, zzf);
    }

    private static zzakb zzc(zzee zzeeVar) {
        byte[] bArr;
        int zzj = zzeeVar.zzj(16);
        zzeeVar.zzh(4);
        int zzj2 = zzeeVar.zzj(2);
        boolean zzi = zzeeVar.zzi();
        zzeeVar.zzh(1);
        byte[] bArr2 = zzeo.zzb;
        if (zzj2 == 1) {
            zzeeVar.zzh(zzeeVar.zzj(8) * 16);
        } else if (zzj2 == 0) {
            int zzj3 = zzeeVar.zzj(16);
            int zzj4 = zzeeVar.zzj(16);
            if (zzj3 > 0) {
                bArr2 = new byte[zzj3];
                zzeeVar.zzn(bArr2, 0, zzj3);
            }
            if (zzj4 > 0) {
                bArr = new byte[zzj4];
                zzeeVar.zzn(bArr, 0, zzj4);
                return new zzakb(zzj, zzi, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakb(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & TsExtractor.TS_STREAM_TYPE_DTS_HD;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[LOOP:3: B:85:0x0163->B:98:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        int zzj;
        char c;
        int i5;
        int i6;
        int i7;
        int zzj2;
        int i8;
        int i9;
        boolean z;
        int zzj3;
        int zzj4;
        int i10;
        int i11;
        int i12;
        int zzj5;
        int i13;
        Paint paint2 = paint;
        zzee zzeeVar = new zzee(bArr, bArr.length);
        int i14 = i2;
        int i15 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzeeVar.zzc() != 0) {
            int zzj6 = zzeeVar.zzj(8);
            if (zzj6 != 240) {
                int i16 = 4;
                int i17 = 1;
                int i18 = 2;
                switch (zzj6) {
                    case 16:
                        int i19 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i4 = 0;
                            while (true) {
                                zzj = zzeeVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                                paint2 = paint;
                                i4 = i5;
                                i19 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i4 = 0;
                            while (true) {
                                zzj = zzeeVar.zzj(2);
                                if (zzj != 0) {
                                    i7 = i19;
                                    i6 = zzj;
                                } else {
                                    if (zzeeVar.zzi()) {
                                        zzj2 = zzeeVar.zzj(3) + 3;
                                        i6 = zzeeVar.zzj(2);
                                    } else {
                                        if (zzeeVar.zzi()) {
                                            i7 = i19;
                                            i5 = i4;
                                            i6 = 0;
                                        } else {
                                            int zzj7 = zzeeVar.zzj(2);
                                            if (zzj7 == 0) {
                                                c = 4;
                                                i5 = i19;
                                                i6 = 0;
                                                i7 = 0;
                                            } else if (zzj7 == i19) {
                                                c = 4;
                                                i5 = i4;
                                                i7 = 2;
                                                i6 = 0;
                                            } else if (zzj7 == 2) {
                                                c = 4;
                                                i5 = i4;
                                                i7 = zzeeVar.zzj(4) + 12;
                                                i6 = zzeeVar.zzj(2);
                                            } else if (zzj7 != 3) {
                                                i5 = i4;
                                                i6 = 0;
                                                i7 = 0;
                                            } else {
                                                zzj2 = zzeeVar.zzj(8) + 29;
                                                i6 = zzeeVar.zzj(2);
                                            }
                                            if (i7 != 0 || paint2 == null) {
                                                i8 = i14;
                                            } else {
                                                int i20 = i15 + 1;
                                                float f = i15;
                                                if (bArr2 != 0) {
                                                    i6 = bArr2[i6];
                                                }
                                                paint2.setColor(iArr[i6]);
                                                i8 = i14;
                                                canvas.drawRect(i14, f, i14 + i7, i20, paint2);
                                            }
                                            i14 = i8 + i7;
                                            if (i5 != 0) {
                                                zzeeVar.zzm();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                i4 = i5;
                                                i19 = 1;
                                            }
                                        }
                                        c = 4;
                                        if (i7 != 0) {
                                        }
                                        i8 = i14;
                                        i14 = i8 + i7;
                                        if (i5 != 0) {
                                        }
                                    }
                                    i7 = zzj2;
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i4 = 0;
                            while (true) {
                                zzj = zzeeVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                                paint2 = paint;
                                i4 = i5;
                                i19 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        boolean z2 = false;
                        while (true) {
                            int zzj8 = zzeeVar.zzj(i16);
                            if (zzj8 != 0) {
                                i9 = 1;
                                z = z2;
                            } else if (zzeeVar.zzi()) {
                                if (zzeeVar.zzi()) {
                                    int zzj9 = zzeeVar.zzj(i18);
                                    if (zzj9 == 0) {
                                        i9 = 1;
                                        z = z2;
                                        zzj8 = 0;
                                    } else if (zzj9 == 1) {
                                        z = z2;
                                        i9 = i18;
                                        zzj8 = 0;
                                    } else if (zzj9 == i18) {
                                        zzj3 = zzeeVar.zzj(i16) + 9;
                                        zzj4 = zzeeVar.zzj(i16);
                                    } else if (zzj9 != 3) {
                                        z = z2;
                                        zzj8 = 0;
                                        i9 = 0;
                                    } else {
                                        zzj3 = zzeeVar.zzj(8) + 25;
                                        zzj4 = zzeeVar.zzj(i16);
                                    }
                                } else {
                                    zzj3 = zzeeVar.zzj(i18) + i16;
                                    zzj4 = zzeeVar.zzj(i16);
                                }
                                i9 = zzj3;
                                z = z2;
                                zzj8 = zzj4;
                            } else {
                                int zzj10 = zzeeVar.zzj(3);
                                if (zzj10 != 0) {
                                    i9 = zzj10 + 2;
                                    z = z2;
                                    zzj8 = 0;
                                } else {
                                    z = true;
                                    zzj8 = 0;
                                    i9 = 0;
                                }
                            }
                            if (i9 == 0 || paint2 == null) {
                                i10 = i14;
                                i11 = i18;
                            } else {
                                int i21 = i15 + 1;
                                float f2 = i15;
                                if (bArr7 != 0) {
                                    zzj8 = bArr7[zzj8];
                                }
                                paint2.setColor(iArr[zzj8]);
                                i10 = i14;
                                i11 = 2;
                                canvas.drawRect(i14, f2, i14 + i9, i21, paint2);
                            }
                            i14 = i10 + i9;
                            if (z) {
                                zzeeVar.zzm();
                                continue;
                            } else {
                                i18 = i11;
                                z2 = z;
                                i16 = 4;
                            }
                        }
                    case 18:
                        int i22 = i14;
                        int i23 = 0;
                        while (true) {
                            int zzj11 = zzeeVar.zzj(8);
                            if (zzj11 != 0) {
                                i12 = i23;
                                zzj5 = i17;
                            } else if (zzeeVar.zzi()) {
                                i12 = i23;
                                zzj5 = zzeeVar.zzj(7);
                                zzj11 = zzeeVar.zzj(8);
                            } else {
                                int zzj12 = zzeeVar.zzj(7);
                                if (zzj12 != 0) {
                                    i12 = i23;
                                    zzj5 = zzj12;
                                    zzj11 = 0;
                                } else {
                                    i12 = i17;
                                    zzj11 = 0;
                                    zzj5 = 0;
                                }
                            }
                            if (zzj5 == 0 || paint2 == null) {
                                i13 = i17;
                            } else {
                                paint2.setColor(iArr[zzj11]);
                                i13 = i17;
                                canvas.drawRect(i22, i15, i22 + zzj5, i15 + 1, paint2);
                            }
                            i22 += zzj5;
                            if (i12 == 0) {
                                i17 = i13;
                                i23 = i12;
                            } else {
                                i14 = i22;
                                continue;
                            }
                        }
                    default:
                        switch (zzj6) {
                            case 32:
                                bArr6 = zzi(4, 4, zzeeVar);
                                break;
                            case 33:
                                bArr4 = zzi(4, 8, zzeeVar);
                                break;
                            case 34:
                                bArr5 = zzi(16, 8, zzeeVar);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i15 += 2;
                i14 = i2;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i, int i2, zzee zzeeVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzeeVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        boolean z;
        zzajn zzajnVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        zzakg zzakgVar;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        zzake zzakeVar;
        int zzj;
        int zzj2;
        int i7;
        int i8;
        int i9;
        int i10;
        zzee zzeeVar = new zzee(bArr, i + i2);
        zzeeVar.zzf(i);
        while (true) {
            z = true;
            if (zzeeVar.zzc() >= 48 && zzeeVar.zzj(8) == 15) {
                zzakg zzakgVar2 = this.zzi;
                int zzj3 = zzeeVar.zzj(8);
                int zzj4 = zzeeVar.zzj(16);
                int zzj5 = zzeeVar.zzj(16);
                int zze = zzeeVar.zze() + zzj5;
                if (zzj5 * 8 > zzeeVar.zzc()) {
                    zzds.zzc("DvbParser", "Data field length exceeds limit");
                    zzeeVar.zzh(zzeeVar.zzc());
                } else {
                    switch (zzj3) {
                        case 16:
                            if (zzj4 == zzakgVar2.zza) {
                                zzakc zzakcVar = zzakgVar2.zzi;
                                int zzj6 = zzeeVar.zzj(8);
                                int zzj7 = zzeeVar.zzj(4);
                                int zzj8 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i11 = zzj5 - 2; i11 > 0; i11 -= 6) {
                                    int zzj9 = zzeeVar.zzj(8);
                                    zzeeVar.zzh(8);
                                    sparseArray.put(zzj9, new zzakd(zzeeVar.zzj(16), zzeeVar.zzj(16)));
                                }
                                zzakc zzakcVar2 = new zzakc(zzj6, zzj7, zzj8, sparseArray);
                                if (zzakcVar2.zzb != 0) {
                                    zzakgVar2.zzi = zzakcVar2;
                                    zzakgVar2.zzc.clear();
                                    zzakgVar2.zzd.clear();
                                    zzakgVar2.zze.clear();
                                    break;
                                } else if (zzakcVar != null) {
                                    if (zzakcVar.zza != zzakcVar2.zza) {
                                        zzakgVar2.zzi = zzakcVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzakc zzakcVar3 = zzakgVar2.zzi;
                            if (zzj4 == zzakgVar2.zza && zzakcVar3 != null) {
                                int zzj10 = zzeeVar.zzj(8);
                                zzeeVar.zzh(4);
                                boolean zzi = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int zzj11 = zzeeVar.zzj(16);
                                int zzj12 = zzeeVar.zzj(16);
                                int zzj13 = zzeeVar.zzj(3);
                                int zzj14 = zzeeVar.zzj(3);
                                zzeeVar.zzh(2);
                                int zzj15 = zzeeVar.zzj(8);
                                int zzj16 = zzeeVar.zzj(8);
                                int zzj17 = zzeeVar.zzj(4);
                                int zzj18 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                int i12 = zzj5 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i12 > 0) {
                                    int zzj19 = zzeeVar.zzj(16);
                                    int zzj20 = zzeeVar.zzj(2);
                                    int zzj21 = zzeeVar.zzj(2);
                                    int zzj22 = zzeeVar.zzj(12);
                                    zzeeVar.zzh(4);
                                    int zzj23 = zzeeVar.zzj(12);
                                    int i13 = i12 - 6;
                                    if (zzj20 != 1) {
                                        if (zzj20 == 2) {
                                            zzj20 = 2;
                                        } else {
                                            i12 = i13;
                                            zzj = 0;
                                            zzj2 = 0;
                                            sparseArray2.put(zzj19, new zzakf(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                        }
                                    }
                                    i12 -= 8;
                                    zzj = zzeeVar.zzj(8);
                                    zzj2 = zzeeVar.zzj(8);
                                    sparseArray2.put(zzj19, new zzakf(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                }
                                zzake zzakeVar2 = new zzake(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                                if (zzakcVar3.zzb == 0 && (zzakeVar = (zzake) zzakgVar2.zzc.get(zzakeVar2.zza)) != null) {
                                    int i14 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakeVar.zzj;
                                        if (i14 < sparseArray3.size()) {
                                            zzakeVar2.zzj.put(sparseArray3.keyAt(i14), (zzakf) sparseArray3.valueAt(i14));
                                            i14++;
                                        }
                                    }
                                }
                                zzakgVar2.zzc.put(zzakeVar2.zza, zzakeVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (zzj4 == zzakgVar2.zza) {
                                zzajz zzb2 = zzb(zzeeVar, zzj5);
                                zzakgVar2.zzd.put(zzb2.zza, zzb2);
                                break;
                            } else if (zzj4 == zzakgVar2.zzb) {
                                zzajz zzb3 = zzb(zzeeVar, zzj5);
                                zzakgVar2.zzf.put(zzb3.zza, zzb3);
                                break;
                            }
                            break;
                        case 19:
                            if (zzj4 == zzakgVar2.zza) {
                                zzakb zzc2 = zzc(zzeeVar);
                                zzakgVar2.zze.put(zzc2.zza, zzc2);
                                break;
                            } else if (zzj4 == zzakgVar2.zzb) {
                                zzakb zzc3 = zzc(zzeeVar);
                                zzakgVar2.zzg.put(zzc3.zza, zzc3);
                                break;
                            }
                            break;
                        case 20:
                            if (zzj4 == zzakgVar2.zza) {
                                zzeeVar.zzh(4);
                                boolean zzi2 = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int zzj24 = zzeeVar.zzj(16);
                                int zzj25 = zzeeVar.zzj(16);
                                if (zzi2) {
                                    int zzj26 = zzeeVar.zzj(16);
                                    i7 = zzeeVar.zzj(16);
                                    i10 = zzeeVar.zzj(16);
                                    i8 = zzeeVar.zzj(16);
                                    i9 = zzj26;
                                } else {
                                    i7 = zzj24;
                                    i8 = zzj25;
                                    i9 = 0;
                                    i10 = 0;
                                }
                                zzakgVar2.zzh = new zzaka(zzj24, zzj25, i9, i7, i10, i8);
                                break;
                            }
                            break;
                    }
                    zzeeVar.zzo(zze - zzeeVar.zze());
                }
            }
        }
        zzakg zzakgVar3 = this.zzi;
        zzakc zzakcVar4 = zzakgVar3.zzi;
        if (zzakcVar4 == null) {
            zzajnVar = new zzajn(zzgjz.zzi(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            zzaka zzakaVar = zzakgVar3.zzh;
            if (zzakaVar == null) {
                zzakaVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakaVar.zza + 1 != bitmap.getWidth() || zzakaVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakaVar.zza + 1, zzakaVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakcVar4.zzc;
            int i15 = 0;
            while (i15 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzakd zzakdVar = (zzakd) sparseArray4.valueAt(i15);
                zzake zzakeVar3 = (zzake) zzakgVar3.zzc.get(sparseArray4.keyAt(i15));
                int i16 = zzakdVar.zza + zzakaVar.zzc;
                int i17 = zzakdVar.zzb + zzakaVar.zze;
                int i18 = zzakeVar3.zzc;
                int i19 = i16 + i18;
                boolean z2 = z;
                int min = Math.min(i19, zzakaVar.zzd);
                int i20 = zzakeVar3.zzd;
                int i21 = i17 + i20;
                canvas3.clipRect(i16, i17, min, Math.min(i21, zzakaVar.zzf));
                int i22 = zzakeVar3.zzf;
                zzajz zzajzVar = (zzajz) zzakgVar3.zzd.get(i22);
                if (zzajzVar == null && (zzajzVar = (zzajz) zzakgVar3.zzf.get(i22)) == null) {
                    zzajzVar = this.zzh;
                }
                SparseArray sparseArray5 = zzakeVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i23 = i15;
                int i24 = 0;
                while (i24 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i24);
                    int i25 = i24;
                    zzakf zzakfVar = (zzakf) sparseArray5.valueAt(i24);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakb zzakbVar = (zzakb) zzakgVar3.zze.get(keyAt);
                    if (zzakbVar == null) {
                        zzakbVar = (zzakb) zzakgVar3.zzg.get(keyAt);
                    }
                    if (zzakbVar != null) {
                        Paint paint = zzakbVar.zzb ? null : this.zzd;
                        i5 = i18;
                        int i26 = zzakeVar3.zze;
                        zzakgVar = zzakgVar3;
                        int i27 = zzakfVar.zza + i16;
                        int i28 = i17 + zzakfVar.zzb;
                        canvas2 = canvas3;
                        i4 = i16;
                        int[] iArr = i26 == 3 ? zzajzVar.zzd : i26 == 2 ? zzajzVar.zzc : zzajzVar.zzb;
                        i6 = i19;
                        zzh(zzakbVar.zzc, iArr, i26, i27, i28, paint, canvas2);
                        zzh(zzakbVar.zzd, iArr, i26, i27, i28 + 1, paint, canvas2);
                    } else {
                        zzakgVar = zzakgVar3;
                        canvas2 = canvas3;
                        i4 = i16;
                        i5 = i18;
                        i6 = i19;
                    }
                    i16 = i4;
                    i19 = i6;
                    i24 = i25 + 1;
                    i18 = i5;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzakgVar3 = zzakgVar;
                }
                zzakg zzakgVar4 = zzakgVar3;
                Canvas canvas4 = canvas3;
                int i29 = i16;
                int i30 = i18;
                int i31 = i19;
                float f = i17;
                float f2 = i29;
                if (zzakeVar3.zzb) {
                    int i32 = zzakeVar3.zze;
                    if (i32 == 3) {
                        i3 = zzajzVar.zzd[zzakeVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i32 == 2 ? zzajzVar.zzc[zzakeVar3.zzh] : zzajzVar.zzb[zzakeVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i31;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i21, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzck zzckVar = new zzck();
                zzckVar.zzc(Bitmap.createBitmap(this.zzj, i29, i17, i30, i20));
                float f4 = zzakaVar.zza;
                zzckVar.zzi(f2 / f4);
                zzckVar.zzj(0);
                float f5 = zzakaVar.zzb;
                zzckVar.zzf(f / f5, 0);
                zzckVar.zzg(0);
                zzckVar.zzm(i30 / f4);
                zzckVar.zzn(i20 / f5);
                arrayList.add(zzckVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i15 = i23 + 1;
                z = z2;
                zzakgVar3 = zzakgVar4;
                sparseArray4 = sparseArray6;
            }
            zzajnVar = new zzajn(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        zzdfVar.zza(zzajnVar);
    }
}
