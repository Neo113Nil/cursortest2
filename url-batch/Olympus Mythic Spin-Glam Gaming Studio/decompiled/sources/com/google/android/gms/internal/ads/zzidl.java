package com.google.android.gms.internal.ads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzidl implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzict zzc = zzict.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzicv.zza = new zzidk();
    }

    public zzidl(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final boolean zzn(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzo(char c) throws IOException {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i2 = this.zze;
            int i3 = this.zzf;
            int i4 = i2;
            while (true) {
                char[] cArr = this.zzd;
                if (i2 >= i3) {
                    break;
                }
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                zzict zzictVar = this.zzc;
                zzict zzictVar2 = zzict.STRICT;
                if (zzictVar == zzictVar2 && c2 < ' ') {
                    throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if (c2 == c) {
                    int i6 = (i5 - i4) - 1;
                    this.zze = i5;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = '\n';
                if (c2 == '\\') {
                    int i7 = i5 - i4;
                    int i8 = i7 - 1;
                    this.zze = i5;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i4, i8);
                    if (this.zze == this.zzf && !zzr(1)) {
                        throw zzv("Unterminated escape sequence");
                    }
                    int i9 = this.zze;
                    int i10 = i9 + 1;
                    this.zze = i10;
                    char c4 = cArr[i9];
                    if (c4 != '\n') {
                        if (c4 != '\"') {
                            if (c4 != '\'') {
                                if (c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                    } else if (c4 == 'f') {
                                        c3 = '\f';
                                    } else if (c4 != 'n') {
                                        if (c4 == 'r') {
                                            c3 = '\r';
                                        } else if (c4 == 't') {
                                            c3 = '\t';
                                        } else {
                                            if (c4 != 'u') {
                                                throw zzv("Invalid escape sequence");
                                            }
                                            if (i9 + 5 > this.zzf && !zzr(4)) {
                                                throw zzv("Unterminated escape sequence");
                                            }
                                            int i11 = this.zze;
                                            int i12 = i11 + 4;
                                            int i13 = 0;
                                            while (i11 < i12) {
                                                int i14 = i13 << 4;
                                                char c5 = cArr[i11];
                                                if (c5 >= '0' && c5 <= '9') {
                                                    i = c5 - '0';
                                                } else if (c5 >= 'a' && c5 <= 'f') {
                                                    i = c5 - 'W';
                                                } else {
                                                    if (c5 < 'A' || c5 > 'F') {
                                                        break loop0;
                                                    }
                                                    i = c5 - '7';
                                                }
                                                i13 = i14 + i;
                                                i11++;
                                            }
                                            this.zze += 4;
                                            c3 = (char) i13;
                                        }
                                    }
                                    sb.append(c3);
                                    i4 = this.zze;
                                    i3 = this.zzf;
                                    i2 = i4;
                                }
                            }
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.zze;
                        i3 = this.zzf;
                        i2 = i4;
                    } else {
                        if (this.zzc == zzictVar2) {
                            throw zzv("Cannot escape a newline character in strict mode");
                        }
                        this.zzg++;
                        this.zzh = i10;
                    }
                    if (this.zzc == zzictVar2) {
                        throw zzv("Invalid escaped character \"'\" in strict mode");
                    }
                    c3 = c4;
                    sb.append(c3);
                    i4 = this.zze;
                    i3 = this.zzf;
                    i2 = i4;
                } else {
                    if (c2 == '\n') {
                        this.zzg++;
                        this.zzh = i5;
                    }
                    i2 = i5;
                }
            }
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp() throws IOException {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.zze + i2;
                if (i3 < this.zzf) {
                    char c = this.zzd[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.zzd, this.zze, i2);
                    this.zze += i2;
                } else if (zzr(i2 + 1)) {
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.zzd, this.zze, i);
            } else {
                sb2.append(this.zzd, this.zze, i);
                sb = sb2.toString();
            }
            this.zze += i;
            return sb;
        } while (zzr(1));
        if (sb2 != null) {
        }
        this.zze += i;
        return sb;
    }

    private final void zzq(int i) throws zzido {
        int i2 = this.zzl;
        if (i2 - 1 >= 1280) {
            String zzl = zzl();
            StringBuilder sb = new StringBuilder(zzl.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(zzl);
            throw new zzido(sb.toString());
        }
        int[] iArr = this.zzk;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzk = Arrays.copyOf(iArr, i3);
            this.zzn = Arrays.copyOf(this.zzn, i3);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i3);
        }
        int[] iArr2 = this.zzk;
        int i4 = this.zzl;
        this.zzl = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzr(int i) throws IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zze;
        this.zzh = i3 - i4;
        char[] cArr = this.zzd;
        int i5 = this.zzf;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zzf = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zzf;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zzf + read;
            this.zzf = i2;
            if (this.zzg == 0 && this.zzh == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final int zzs(boolean z) throws IOException {
        int i;
        int i2 = this.zze;
        int i3 = this.zzf;
        while (true) {
            if (i2 == i3) {
                this.zze = i2;
                if (!zzr(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i2 = this.zze;
                i3 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zze = i4;
                    if (i4 == i3) {
                        this.zze = i2;
                        boolean zzr = zzr(2);
                        this.zze++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i5 = this.zze;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.zze = i5 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i6 = this.zze;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.zze + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.zze + 2;
                                i3 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i6 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.zze = i5 + 1;
                        zzu();
                        i2 = this.zze;
                        i3 = this.zzf;
                    }
                } else {
                    if (c != '#') {
                        this.zze = i4;
                        return c;
                    }
                    this.zze = i4;
                    zzt();
                    zzu();
                    i2 = this.zze;
                    i3 = this.zzf;
                }
            }
            i2 = i4;
        }
    }

    private final void zzt() throws zzido {
        if (this.zzc != zzict.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            c = cArr[i];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i2;
                return;
            }
        } while (c != '\r');
    }

    private final zzido zzv(String str) throws zzido {
        String zzl = zzl();
        StringBuilder sb = new StringBuilder(str.length() + zzl.length() + 79);
        sb.append(str);
        sb.append(zzl);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzido(sb.toString());
    }

    private final IllegalStateException zzw(String str) throws IOException {
        int zzm = zzm();
        String zza = zzidm.zza(zzm());
        String zzl = zzl();
        int length = str.length() + 18 + zza.length() + zzl.length();
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(zzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(length + 5 + concat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(zza);
        sb.append(zzl);
        sb.append("\nSee ");
        sb.append(concat);
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return zzidl.class.getSimpleName().concat(zzl());
    }

    public final void zza(zzict zzictVar) {
        Objects.requireNonNull(zzictVar);
        this.zzc = zzictVar;
    }

    public final void zzb() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        if (zzn(r1) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a4, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0217, code lost:
    
        if (r6 != 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0219, code lost:
    
        if (r15 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0221, code lost:
    
        if (r16 == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
    
        if (r11 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
    
        if (r14 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0237, code lost:
    
        r21.zzi = r11;
        r21.zze += r10;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0240, code lost:
    
        r21.zza = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0233, code lost:
    
        if (r14 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0229, code lost:
    
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        r1 = 2;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r6 == r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r6 == 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
    
        if (r6 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024b, code lost:
    
        r21.zzj = r10;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzg() throws IOException {
        int i;
        int i2;
        int zzs;
        int i3;
        int zzs2;
        String str;
        String str2;
        int i4;
        char c;
        int i5;
        int i6;
        int[] iArr = this.zzk;
        int i7 = this.zzl - 1;
        int i8 = iArr[i7];
        int i9 = 3;
        int i10 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    i = 2;
                    i2 = 4;
                } else if (i8 == 5) {
                    i2 = 4;
                    i = 2;
                } else if (i8 == 4) {
                    iArr[i7] = 5;
                    int zzs3 = zzs(true);
                    if (zzs3 != 58) {
                        if (zzs3 != 61) {
                            throw zzv("Expected ':'");
                        }
                        zzt();
                        if (this.zze < this.zzf || zzr(1)) {
                            char[] cArr = this.zzd;
                            int i11 = this.zze;
                            if (cArr[i11] == '>') {
                                this.zze = i11 + 1;
                            }
                        }
                    }
                } else if (i8 == 6) {
                    if (this.zzc == zzict.LENIENT) {
                        zzs(true);
                        int i12 = this.zze;
                        this.zze = i12 - 1;
                        if (i12 + 4 <= this.zzf || zzr(5)) {
                            int i13 = this.zze;
                            char[] cArr2 = this.zzd;
                            if (cArr2[i13] == ')' && cArr2[i13 + 1] == ']' && cArr2[i13 + 2] == '}' && cArr2[i13 + 3] == '\'' && cArr2[i13 + 4] == '\n') {
                                this.zze = i13 + 5;
                            }
                        }
                    }
                    this.zzk[this.zzl - 1] = 7;
                } else if (i8 == 7) {
                    i3 = 0;
                    if (zzs(false) == -1) {
                        i9 = 17;
                        this.zza = i9;
                        return i9;
                    }
                    zzt();
                    this.zze--;
                } else {
                    i3 = 0;
                    if (i8 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iArr[i7] = i2;
                if (i8 == 5 && (zzs = zzs(true)) != 44) {
                    if (zzs != 59) {
                        if (zzs != 125) {
                            throw zzv("Unterminated object");
                        }
                        i9 = i;
                        this.zza = i9;
                        return i9;
                    }
                    zzt();
                }
                int zzs4 = zzs(true);
                if (zzs4 == 34) {
                    i9 = 13;
                } else {
                    if (zzs4 == 39) {
                        zzt();
                        this.zza = 12;
                        return 12;
                    }
                    if (zzs4 != 125) {
                        zzt();
                        this.zze--;
                        if (!zzn((char) zzs4)) {
                            throw zzv("Expected name");
                        }
                        i9 = 14;
                    } else {
                        if (i8 == 5) {
                            throw zzv("Expected name");
                        }
                        i9 = i;
                    }
                }
                this.zza = i9;
                return i9;
            }
            int zzs5 = zzs(true);
            if (zzs5 != 44) {
                if (zzs5 != 59) {
                    if (zzs5 != 93) {
                        throw zzv("Unterminated array");
                    }
                    i9 = 4;
                    this.zza = i9;
                    return i9;
                }
                zzt();
            }
            zzs2 = zzs(true);
            if (zzs2 == 34) {
                if (zzs2 == 39) {
                    zzt();
                    this.zza = 8;
                    return 8;
                }
                if (zzs2 != 44 && zzs2 != 59) {
                    if (zzs2 != 91) {
                        if (zzs2 != 93) {
                            if (zzs2 != 123) {
                                int i14 = this.zze - 1;
                                this.zze = i14;
                                char[] cArr3 = this.zzd;
                                char c2 = cArr3[i14];
                                if (c2 == 't' || c2 == 'T') {
                                    str = "TRUE";
                                    str2 = "true";
                                    i4 = 5;
                                } else if (c2 == 'f' || c2 == 'F') {
                                    str = "FALSE";
                                    str2 = "false";
                                    i4 = 6;
                                } else {
                                    if (c2 == 'n' || c2 == 'N') {
                                        str = "NULL";
                                        str2 = POBCommonConstants.NULL_VALUE;
                                        i4 = 7;
                                    }
                                    i4 = i3;
                                    if (i4 == 0) {
                                        return i4;
                                    }
                                    int i15 = this.zze;
                                    int i16 = this.zzf;
                                    long j = 0;
                                    int i17 = i3;
                                    int i18 = i17;
                                    int i19 = i18;
                                    long j2 = 0;
                                    boolean z = true;
                                    while (true) {
                                        if (i15 + i18 == i16) {
                                            if (i18 == 1024) {
                                                break;
                                            }
                                            if (!zzr(i18 + 1)) {
                                                break;
                                            }
                                            int i20 = this.zze;
                                            i16 = this.zzf;
                                            i15 = i20;
                                        }
                                        char c3 = cArr3[i15 + i18];
                                        if (c3 != '+') {
                                            if (c3 == 'E' || c3 == 'e') {
                                                if (i17 != 2 && i17 != 4) {
                                                    break;
                                                }
                                                i17 = 5;
                                                i18++;
                                            } else if (c3 == '-') {
                                                i5 = 6;
                                                if (i17 == 0) {
                                                    i17 = 1;
                                                    i19 = 1;
                                                    i18++;
                                                } else {
                                                    if (i17 != 5) {
                                                        break;
                                                    }
                                                    i17 = i5;
                                                    i18++;
                                                }
                                            } else if (c3 == '.') {
                                                if (i17 != 2) {
                                                    break;
                                                }
                                                i17 = 3;
                                                i18++;
                                            } else {
                                                if (c3 < '0' || c3 > '9') {
                                                    break;
                                                }
                                                if (i17 == 1 || i17 == 0) {
                                                    j2 = -(c3 - '0');
                                                    i17 = 2;
                                                } else if (i17 == 2) {
                                                    if (j2 == j) {
                                                        break;
                                                    }
                                                    long j3 = (10 * j2) - (c3 - '0');
                                                    z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                    j2 = j3;
                                                } else if (i17 == 3) {
                                                    i17 = 4;
                                                } else if (i17 == 5 || i17 == 6) {
                                                    i17 = 7;
                                                }
                                                j = 0;
                                                i18++;
                                            }
                                            if (i6 == 0) {
                                                return i6;
                                            }
                                            if (!zzn(cArr3[this.zze])) {
                                                throw zzv("Expected value");
                                            }
                                            zzt();
                                            this.zza = 10;
                                            return 10;
                                        }
                                        i5 = 6;
                                        if (i17 != 5) {
                                            break;
                                        }
                                        i17 = i5;
                                        i18++;
                                    }
                                    i6 = 0;
                                    if (i6 == 0) {
                                    }
                                }
                                zzict zzictVar = this.zzc;
                                zzict zzictVar2 = zzict.STRICT;
                                int i21 = i3;
                                while (true) {
                                    int length = str2.length();
                                    if (i21 < length) {
                                        if ((this.zze + i21 >= this.zzf && !zzr(i21 + 1)) || ((c = cArr3[this.zze + i21]) != str2.charAt(i21) && (zzictVar == zzictVar2 || c != str.charAt(i21)))) {
                                            break;
                                        }
                                        i21++;
                                    } else if ((this.zze + length >= this.zzf && !zzr(length + 1)) || !zzn(cArr3[this.zze + length])) {
                                        this.zze += length;
                                        this.zza = i4;
                                    }
                                }
                                i4 = i3;
                                if (i4 == 0) {
                                }
                            } else {
                                i9 = 1;
                            }
                        } else if (i8 == 1) {
                            i9 = 4;
                        }
                    }
                }
                if (i8 != 1 && i8 != 2) {
                    throw zzv("Unexpected value");
                }
                zzt();
                this.zze--;
                this.zza = 7;
                return 7;
            }
            i9 = 9;
            this.zza = i9;
            return i9;
        }
        iArr[i7] = 2;
        i3 = 0;
        zzs2 = zzs(true);
        if (zzs2 == 34) {
        }
        this.zza = i9;
        return i9;
    }

    public final String zzh() throws IOException {
        String zzo;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 14) {
            zzo = zzp();
        } else if (i == 12) {
            zzo = zzo('\'');
        } else {
            if (i != 13) {
                throw zzw("a name");
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = zzo;
        return zzo;
    }

    public final String zzi() throws IOException {
        String str;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 10) {
            str = zzp();
        } else if (i == 8) {
            str = zzo('\'');
        } else if (i == 9) {
            str = zzo('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (i != 16) {
                throw zzw("a string");
            }
            String str2 = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            str = str2;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean zzj() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 7) {
            throw zzw(POBCommonConstants.NULL_VALUE);
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    final String zzl() {
        int i = this.zzg + 1;
        int i2 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i3 = 0; i3 < this.zzl; i3++) {
            int i4 = this.zzk[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.zzn[i3];
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i3];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i4);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i6 = i2 + 1;
        String sb3 = sb.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i6).length() + 6 + sb3.length());
        sb4.append(" at line ");
        sb4.append(i);
        sb4.append(" column ");
        sb4.append(i6);
        sb4.append(" path ");
        sb4.append(sb3);
        return sb4.toString();
    }

    public final int zzm() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
