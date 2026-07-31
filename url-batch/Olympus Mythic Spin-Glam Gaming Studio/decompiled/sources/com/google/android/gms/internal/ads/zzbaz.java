package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbaz implements zzbay {
    protected static volatile zzbcg zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;

    @Nullable
    protected zzbby zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzbaz(Context context) {
        try {
            zzbac.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdL)).booleanValue()) {
                this.zzr = new zzbby();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzbax zzbaxVar;
        String str2;
        int i2;
        int i3;
        Exception exc;
        int i4;
        int i5;
        String zzb;
        zzaya zza2;
        int i6;
        int i7;
        int i8 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdA)).booleanValue();
        zzaya zzayaVar = null;
        if (booleanValue) {
            zzbaxVar = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzbaxVar = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                zzayaVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    i3 = 1;
                    if (booleanValue) {
                        if (i8 != i2) {
                        }
                        zzbaxVar.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzayaVar != null) {
                        }
                        zzb = Integer.toString(5);
                        return zzb;
                    }
                    i4 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzayaVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            } else {
                if (i8 == 2) {
                    zza2 = zzc(context, view, activity);
                    i6 = 1008;
                } else {
                    zza2 = zza(context, null);
                    i6 = 1000;
                }
                zzayaVar = zza2;
                i7 = i6;
            }
            if (!booleanValue || zzbaxVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                i3 = 1;
                try {
                    zzbaxVar.zza(i7, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzbaxVar != null) {
                        if (i8 != i2) {
                            i5 = 1003;
                            i4 = 2;
                        } else {
                            i4 = 2;
                            if (i8 == 2) {
                                i5 = 1009;
                            } else {
                                i5 = 1001;
                                i8 = i3;
                            }
                        }
                        zzbaxVar.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzayaVar != null) {
                        }
                        zzb = Integer.toString(5);
                        return zzb;
                    }
                    i4 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzayaVar != null) {
                    }
                    zzb = Integer.toString(5);
                    return zzb;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
            i3 = 1;
        }
        i4 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzayaVar != null) {
            try {
            } catch (Exception e4) {
                zzb = Integer.toString(7);
                if (booleanValue && zzbaxVar != null) {
                    zzbaxVar.zza(i8 == i2 ? 1007 : i8 == i4 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((zzaza) zzayaVar.zzbu()).zzbr() != 0) {
                zzaza zzazaVar = (zzaza) zzayaVar.zzbu();
                int i9 = zzbac.zzc;
                zzb = zzbac.zzb(zzazaVar.zzaN(), str);
                if (booleanValue && zzbaxVar != null) {
                    zzbaxVar.zza(i8 == i2 ? 1006 : i8 == i4 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zzb;
            }
        }
        zzb = Integer.toString(5);
        return zzb;
    }

    protected abstract zzaya zza(Context context, zzaxm zzaxmVar);

    protected abstract zzaya zzb(Context context, View view, Activity activity);

    protected abstract zzaya zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzbay
    public final synchronized void zzd(@Nullable MotionEvent motionEvent) {
        Long l;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.zzs;
                double d2 = rawY - this.zzt;
                this.zzk += Math.sqrt((d * d) + (d2 * d2));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.zzb = obtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzbci zzm = zzm(motionEvent);
                        Long l2 = zzm.zzd;
                        if (l2 != null && zzm.zzg != null) {
                            this.zzi += l2.longValue() + zzm.zzg.longValue();
                        }
                        if (this.zzq != null && (l = zzm.zze) != null && zzm.zzh != null) {
                            this.zzj += l.longValue() + zzm.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzbbw unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final synchronized void zze(int i, int i2, int i3) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdy)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbby zzbbyVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdL)).booleanValue() || (zzbbyVar = this.zzr) == null) {
            return;
        }
        zzbbyVar.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        if (zzbcj.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    protected abstract zzbci zzm(MotionEvent motionEvent) throws zzbbw;

    protected abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzbbw;
}
