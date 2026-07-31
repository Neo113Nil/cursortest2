package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfzf {
    public static boolean zza(zzbei zzbeiVar) {
        int ordinal = zzbeiVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    public static final zzbei zzb(Context context, zzfyi zzfyiVar) {
        zzbei zzbeiVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new zzhau(Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                if (zzfyiVar != null) {
                    zzfyiVar.zze(5017, "No .so");
                } else {
                    zzfyiVar = null;
                }
                zzbeiVar = zzbei.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfyiVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfyiVar);
                        zzbeiVar = zzbei.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzbeiVar = zzbei.X86;
                        } else if (s == 40) {
                            zzbeiVar = zzbei.ARM7;
                        } else if (s == 62) {
                            zzbeiVar = zzbei.X86_64;
                        } else if (s == 183) {
                            zzbeiVar = zzbei.ARM64;
                        } else if (s != 243) {
                            zzc(bArr, null, context, zzfyiVar);
                            zzbeiVar = zzbei.UNSUPPORTED;
                        } else {
                            zzbeiVar = zzbei.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbeiVar = zzbei.UNSUPPORTED;
                }
            }
        } else {
            if (zzfyiVar != null) {
                zzfyiVar.zze(5017, "No lib/");
            } else {
                zzfyiVar = null;
            }
            zzbeiVar = zzbei.UNKNOWN;
        }
        if (zzbeiVar == zzbei.UNKNOWN) {
            String zzd = zzd(context, zzfyiVar);
            if (TextUtils.isEmpty(zzd)) {
                zzc(null, "Empty dev arch", context, zzfyiVar);
                zzbeiVar = zzbei.UNSUPPORTED;
            } else if (zzd.equalsIgnoreCase("i686") || zzd.equalsIgnoreCase("x86")) {
                zzbeiVar = zzbei.X86;
            } else if (zzd.equalsIgnoreCase("x86_64")) {
                zzbeiVar = zzbei.X86_64;
            } else if (zzd.equalsIgnoreCase("arm64-v8a")) {
                zzbeiVar = zzbei.ARM64;
            } else if (zzd.equalsIgnoreCase("armeabi-v7a") || zzd.equalsIgnoreCase("armv71")) {
                zzbeiVar = zzbei.ARM7;
            } else if (zzd.equalsIgnoreCase("riscv64")) {
                zzbeiVar = zzbei.RISCV64;
            } else {
                zzc(null, zzd, context, zzfyiVar);
                zzbeiVar = zzbei.UNSUPPORTED;
            }
        }
        if (zzfyiVar != null) {
            zzfyiVar.zze(5018, zzbeiVar.name());
        }
        return zzbeiVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfyi zzfyiVar) {
        if (zzfyiVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzgva.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfyiVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfyi zzfyiVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzgva.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            if (zzfyiVar != null) {
                zzfyiVar.zzc(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            if (zzfyiVar != null) {
                zzfyiVar.zzc(2024, 0L, e2);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
