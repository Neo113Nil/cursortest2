package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class nd0 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final gc3 c = new gc3();
    public ri1 d;
    public int e;
    public int f;
    public long g;

    public final void a() {
        this.e = 0;
        this.b.clear();
        gc3 gc3Var = this.c;
        gc3Var.b = 0;
        gc3Var.c = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x043a, code lost:
    
        throw new yads.cc2("EBML lacing sample size out of range.", null, true, 1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:298:0x05c6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0630  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(pd0 pd0Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ih1 ih1Var;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        boolean z3;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        long j;
        int i13;
        int i14;
        double longBitsToDouble;
        long j2;
        int i15;
        int a;
        int i16 = -1;
        int i17 = 1;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            md0 md0Var = (md0) this.b.peek();
            if (md0Var != null && pd0Var.d >= md0Var.b) {
                this.d.a.b(((md0) this.b.pop()).a);
                return i17;
            }
            int i18 = 0;
            if (this.e == 0) {
                long a2 = this.c.a(pd0Var, i17, false, 4);
                if (a2 == -2) {
                    pd0Var.f = 0;
                    while (true) {
                        pd0Var.b(this.a, 0, 4, false);
                        byte b = this.a[0];
                        i15 = 0;
                        while (true) {
                            long[] jArr = gc3.d;
                            if (i15 < 8) {
                                long j3 = jArr[i15] & b;
                                i15 += i17;
                                if (j3 != 0) {
                                }
                            } else {
                                i15 = i16;
                            }
                        }
                        if (i15 != i16 && i15 <= 4) {
                            a = (int) gc3.a(this.a, i15, false);
                            this.d.a.getClass();
                            if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                            }
                        }
                        pd0Var.a(i17);
                    }
                    pd0Var.a(i15);
                    j2 = a;
                } else {
                    j2 = a2;
                }
                if (j2 == -1) {
                    return false;
                }
                this.f = (int) j2;
                this.e = i17;
            }
            if (this.e == i17) {
                this.g = this.c.a(pd0Var, false, i17, 8);
                this.e = 2;
            }
            ri1 ri1Var = this.d;
            int i19 = this.f;
            ri1Var.a.getClass();
            switch (i19) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i = i17;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (i == i17) {
                    long j4 = pd0Var.d;
                    this.b.push(new md0(this.f, this.g + j4));
                    ri1 ri1Var2 = this.d;
                    int i20 = this.f;
                    long j5 = this.g;
                    ti1 ti1Var = ri1Var2.a;
                    wp0 wp0Var = ti1Var.b0;
                    if (wp0Var != null) {
                        if (i20 == 160) {
                            i2 = 0;
                            ti1Var.Q = false;
                            ti1Var.R = 0L;
                        } else if (i20 == 174) {
                            i2 = 0;
                            ti1Var.u = new si1();
                        } else if (i20 != 187) {
                            if (i20 == 19899) {
                                ti1Var.w = -1;
                                ti1Var.x = -1L;
                            } else if (i20 == 20533) {
                                ti1Var.a(i20);
                                ti1Var.u.h = true;
                            } else if (i20 == 21968) {
                                ti1Var.a(i20);
                                ti1Var.u.x = true;
                            } else if (i20 == 408125543) {
                                long j6 = ti1Var.q;
                                if (j6 != -1 && j6 != j4) {
                                    throw new cc2("Multiple Segment elements not supported", null, true, 1);
                                }
                                ti1Var.q = j4;
                                ti1Var.p = j5;
                            } else if (i20 != 475249515) {
                                if (i20 == 524531317 && !ti1Var.v) {
                                    if (ti1Var.d && ti1Var.z != -1) {
                                        ti1Var.y = true;
                                    } else {
                                        wp0Var.a(new lx2(ti1Var.t, 0L));
                                        ti1Var.v = true;
                                    }
                                }
                            } else {
                                ti1Var.C = new ih1();
                                ti1Var.D = new ih1();
                            }
                            i2 = 0;
                        } else {
                            i2 = 0;
                            ti1Var.E = false;
                        }
                        this.e = i2;
                        return true;
                    }
                    throw new IllegalStateException();
                }
                if (i == 2) {
                    long j7 = this.g;
                    if (j7 <= 8) {
                        ri1 ri1Var3 = this.d;
                        int i21 = this.f;
                        int i22 = (int) j7;
                        pd0Var.a(this.a, 0, i22, false);
                        long j8 = 0;
                        for (int i23 = 0; i23 < i22; i23++) {
                            j8 = (j8 << 8) | (this.a[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        }
                        ti1 ti1Var2 = ri1Var3.a;
                        ti1Var2.getClass();
                        if (i21 != 20529) {
                            if (i21 != 20530) {
                                switch (i21) {
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.d = (int) j8;
                                        break;
                                    case 136:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.V = j8 == 1;
                                        break;
                                    case 155:
                                        ti1Var2.I = ti1Var2.a(j8);
                                        break;
                                    case 159:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.O = (int) j8;
                                        break;
                                    case 176:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.m = (int) j8;
                                        break;
                                    case 179:
                                        ih1 ih1Var2 = ti1Var2.C;
                                        if (ih1Var2 != null && ti1Var2.D != null) {
                                            ih1Var2.a(ti1Var2.a(j8));
                                            break;
                                        } else {
                                            throw new cc2("Element " + i21 + " must be in a Cues", null, true, 1);
                                        }
                                    case 186:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.n = (int) j8;
                                        break;
                                    case AD_RESPONSE_EMPTY_VALUE:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.c = (int) j8;
                                        break;
                                    case 231:
                                        ti1Var2.B = ti1Var2.a(j8);
                                        break;
                                    case 238:
                                        ti1Var2.P = (int) j8;
                                        break;
                                    case 241:
                                        z = true;
                                        if (!ti1Var2.E) {
                                            if (ti1Var2.C != null && (ih1Var = ti1Var2.D) != null) {
                                                ih1Var.a(j8);
                                                ti1Var2.E = true;
                                                break;
                                            } else {
                                                throw new cc2("Element " + i21 + " must be in a Cues", null, true, 1);
                                            }
                                        }
                                        break;
                                    case 251:
                                        z = true;
                                        ti1Var2.Q = true;
                                        break;
                                    case 16871:
                                        z = true;
                                        ti1Var2.a(i21);
                                        ti1Var2.u.g = (int) j8;
                                        break;
                                    case 16980:
                                        if (j8 != 3) {
                                            throw new cc2("ContentCompAlgo " + j8 + " not supported", null, true, 1);
                                        }
                                        break;
                                    case 17029:
                                        if (j8 < 1 || j8 > 2) {
                                            throw new cc2("DocTypeReadVersion " + j8 + " not supported", null, true, 1);
                                        }
                                        break;
                                    case 17143:
                                        if (j8 != 1) {
                                            throw new cc2("EBMLReadVersion " + j8 + " not supported", null, true, 1);
                                        }
                                        break;
                                    case 18401:
                                        if (j8 != 5) {
                                            throw new cc2("ContentEncAlgo " + j8 + " not supported", null, true, 1);
                                        }
                                        break;
                                    case 18408:
                                        if (j8 != 1) {
                                            throw new cc2("AESSettingsCipherMode " + j8 + " not supported", null, true, 1);
                                        }
                                        break;
                                    case 21420:
                                        ti1Var2.x = j8 + ti1Var2.q;
                                        break;
                                    case 21432:
                                        int i24 = (int) j8;
                                        ti1Var2.a(i21);
                                        if (i24 == 0) {
                                            i4 = 0;
                                            ti1Var2.u.w = 0;
                                            i3 = i4;
                                            z = true;
                                            this.e = i3;
                                            return z;
                                        }
                                        z2 = true;
                                        if (i24 != 1) {
                                            if (i24 == 3) {
                                                ti1Var2.u.w = 1;
                                            } else if (i24 == 15) {
                                                ti1Var2.u.w = 3;
                                            }
                                            z = z2;
                                            break;
                                        } else {
                                            ti1Var2.u.w = 2;
                                            break;
                                        }
                                    case 21680:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.o = (int) j8;
                                        break;
                                    case 21682:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.q = (int) j8;
                                        break;
                                    case 21690:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.p = (int) j8;
                                        break;
                                    case 21930:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.U = j8 == 1;
                                        break;
                                    case 21998:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.f = (int) j8;
                                        break;
                                    case 22186:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.R = j8;
                                        break;
                                    case 22203:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.S = j8;
                                        break;
                                    case 25188:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.P = (int) j8;
                                        break;
                                    case 30114:
                                        ti1Var2.R = j8;
                                        break;
                                    case 30321:
                                        ti1Var2.a(i21);
                                        int i25 = (int) j8;
                                        if (i25 == 0) {
                                            i4 = 0;
                                            ti1Var2.u.r = 0;
                                            i3 = i4;
                                            z = true;
                                            this.e = i3;
                                            return z;
                                        }
                                        z2 = true;
                                        if (i25 == 1) {
                                            ti1Var2.u.r = 1;
                                        } else if (i25 == 2) {
                                            ti1Var2.u.r = 2;
                                        } else if (i25 == 3) {
                                            ti1Var2.u.r = 3;
                                        }
                                        z = z2;
                                        break;
                                    case 2352003:
                                        ti1Var2.a(i21);
                                        ti1Var2.u.e = (int) j8;
                                        break;
                                    case 2807729:
                                        ti1Var2.r = j8;
                                        break;
                                    default:
                                        switch (i21) {
                                            case 21945:
                                                ti1Var2.a(i21);
                                                int i26 = (int) j8;
                                                z2 = true;
                                                if (i26 != 1) {
                                                    if (i26 == 2) {
                                                        ti1Var2.u.A = 1;
                                                    }
                                                    z = z2;
                                                    break;
                                                } else {
                                                    ti1Var2.u.A = 2;
                                                    break;
                                                }
                                            case 21946:
                                                ti1Var2.a(i21);
                                                int i27 = (int) j8;
                                                mq mqVar = fx.g;
                                                if (i27 != 1) {
                                                    if (i27 != 16) {
                                                        if (i27 != 18) {
                                                            if (i27 != 6 && i27 != 7) {
                                                                i6 = -1;
                                                                i5 = -1;
                                                                if (i5 != i6) {
                                                                    ti1Var2.u.z = i5;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            i5 = 7;
                                                        }
                                                    } else {
                                                        i5 = 6;
                                                    }
                                                    i6 = -1;
                                                    if (i5 != i6) {
                                                    }
                                                }
                                                i5 = 3;
                                                i6 = -1;
                                                if (i5 != i6) {
                                                }
                                                break;
                                            case 21947:
                                                ti1Var2.a(i21);
                                                si1 si1Var = ti1Var2.u;
                                                si1Var.x = true;
                                                int i28 = (int) j8;
                                                mq mqVar2 = fx.g;
                                                if (i28 == 1) {
                                                    i7 = -1;
                                                    i8 = 1;
                                                } else if (i28 == 9) {
                                                    i7 = -1;
                                                    i8 = 6;
                                                } else if (i28 == 4 || i28 == 5 || i28 == 6 || i28 == 7) {
                                                    i7 = -1;
                                                    i8 = 2;
                                                } else {
                                                    i7 = -1;
                                                    i8 = -1;
                                                }
                                                if (i8 != i7) {
                                                    si1Var.y = i8;
                                                    break;
                                                }
                                                break;
                                            case 21948:
                                                ti1Var2.a(i21);
                                                ti1Var2.u.B = (int) j8;
                                                break;
                                            case 21949:
                                                ti1Var2.a(i21);
                                                ti1Var2.u.C = (int) j8;
                                                break;
                                        }
                                        this.e = i3;
                                        return z;
                                }
                            } else if (j8 != 1) {
                                throw new cc2("ContentEncodingScope " + j8 + " not supported", null, true, 1);
                            }
                            i3 = 0;
                            z = true;
                            this.e = i3;
                            return z;
                        }
                        z = true;
                        if (j8 != 0) {
                            throw new cc2("ContentEncodingOrder " + j8 + " not supported", null, true, 1);
                        }
                        i3 = 0;
                        this.e = i3;
                        return z;
                    }
                    throw new cc2("Invalid integer size: " + this.g, null, true, 1);
                }
                if (i == 3) {
                    long j9 = this.g;
                    if (j9 <= 2147483647L) {
                        ri1 ri1Var4 = this.d;
                        int i29 = this.f;
                        int i30 = (int) j9;
                        if (i30 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i30];
                            pd0Var.a(bArr, 0, i30, false);
                            while (i30 > 0 && bArr[i30 - 1] == 0) {
                                i30--;
                            }
                            str = new String(bArr, 0, i30);
                        }
                        ti1 ti1Var3 = ri1Var4.a;
                        ti1Var3.getClass();
                        if (i29 == 134) {
                            z3 = true;
                            ti1Var3.a(i29);
                            ti1Var3.u.b = str;
                        } else {
                            if (i29 != 17026) {
                                if (i29 == 21358) {
                                    ti1Var3.a(i29);
                                    ti1Var3.u.a = str;
                                } else if (i29 == 2274716) {
                                    ti1Var3.a(i29);
                                    ti1Var3.u.W = str;
                                }
                            } else if ("webm".equals(str)) {
                                z3 = true;
                            } else if (!"matroska".equals(str)) {
                                throw new cc2("DocType " + str + " not supported", null, true, 1);
                            }
                            i9 = 0;
                            z3 = true;
                            this.e = i9;
                            return z3;
                        }
                        i9 = 0;
                        this.e = i9;
                        return z3;
                    }
                    throw new cc2("String element size: " + this.g, null, true, 1);
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new cc2(gg2.a(i, "Invalid element type "), null, i17, i17);
                    }
                    long j10 = this.g;
                    if (j10 != 4 && j10 != 8) {
                        throw new cc2("Invalid float size: " + this.g, null, i17, i17);
                    }
                    ri1 ri1Var5 = this.d;
                    int i31 = this.f;
                    int i32 = (int) j10;
                    pd0Var.a(this.a, 0, i32, false);
                    long j11 = 0;
                    for (int i33 = 0; i33 < i32; i33 += i17) {
                        j11 = (j11 << 8) | (this.a[i33] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    }
                    if (i32 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) j11);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(j11);
                    }
                    ti1 ti1Var4 = ri1Var5.a;
                    if (i31 == 181) {
                        ti1Var4.a(i31);
                        ti1Var4.u.Q = (int) longBitsToDouble;
                    } else if (i31 != 17545) {
                        switch (i31) {
                            case 21969:
                                ti1Var4.a(i31);
                                ti1Var4.u.D = (float) longBitsToDouble;
                                break;
                            case 21970:
                                ti1Var4.a(i31);
                                ti1Var4.u.E = (float) longBitsToDouble;
                                break;
                            case 21971:
                                ti1Var4.a(i31);
                                ti1Var4.u.F = (float) longBitsToDouble;
                                break;
                            case 21972:
                                ti1Var4.a(i31);
                                ti1Var4.u.G = (float) longBitsToDouble;
                                break;
                            case 21973:
                                ti1Var4.a(i31);
                                ti1Var4.u.H = (float) longBitsToDouble;
                                break;
                            case 21974:
                                ti1Var4.a(i31);
                                ti1Var4.u.I = (float) longBitsToDouble;
                                break;
                            case 21975:
                                ti1Var4.a(i31);
                                ti1Var4.u.J = (float) longBitsToDouble;
                                break;
                            case 21976:
                                ti1Var4.a(i31);
                                ti1Var4.u.K = (float) longBitsToDouble;
                                break;
                            case 21977:
                                ti1Var4.a(i31);
                                ti1Var4.u.L = (float) longBitsToDouble;
                                break;
                            case 21978:
                                ti1Var4.a(i31);
                                ti1Var4.u.M = (float) longBitsToDouble;
                                break;
                            default:
                                switch (i31) {
                                    case 30323:
                                        ti1Var4.a(i31);
                                        ti1Var4.u.s = (float) longBitsToDouble;
                                        break;
                                    case 30324:
                                        ti1Var4.a(i31);
                                        ti1Var4.u.t = (float) longBitsToDouble;
                                        break;
                                    case 30325:
                                        ti1Var4.a(i31);
                                        ti1Var4.u.u = (float) longBitsToDouble;
                                        break;
                                    default:
                                        ti1Var4.getClass();
                                        break;
                                }
                        }
                    } else {
                        ti1Var4.s = (long) longBitsToDouble;
                    }
                    this.e = 0;
                    return i17;
                }
                ri1 ri1Var6 = this.d;
                int i34 = this.f;
                int i35 = (int) this.g;
                ti1 ti1Var5 = ri1Var6.a;
                ti1Var5.getClass();
                if (i34 == 161 || i34 == 163) {
                    if (ti1Var5.G == 0) {
                        ti1Var5.M = (int) ti1Var5.b.a(pd0Var, false, i17, 8);
                        ti1Var5.N = ti1Var5.b.c;
                        ti1Var5.I = -9223372036854775807L;
                        ti1Var5.G = i17;
                        ti1Var5.g.c(0);
                    }
                    si1 si1Var2 = (si1) ti1Var5.c.get(ti1Var5.M);
                    if (si1Var2 == null) {
                        pd0Var.a(i35 - ti1Var5.N);
                        ti1Var5.G = 0;
                    } else {
                        si1Var2.X.getClass();
                        if (ti1Var5.G == i17) {
                            ti1Var5.a(pd0Var, 3);
                            int i36 = (ti1Var5.g.a[2] & 6) >> i17;
                            if (i36 == 0) {
                                ti1Var5.K = i17;
                                int[] iArr = ti1Var5.L;
                                if (iArr == null) {
                                    iArr = new int[i17];
                                } else if (iArr.length < i17) {
                                    iArr = new int[Math.max(iArr.length * 2, i17)];
                                }
                                ti1Var5.L = iArr;
                                iArr[0] = (i35 - ti1Var5.N) - 3;
                            } else {
                                ti1Var5.a(pd0Var, 4);
                                int i37 = (ti1Var5.g.a[3] & 255) + i17;
                                ti1Var5.K = i37;
                                int[] iArr2 = ti1Var5.L;
                                if (iArr2 == null) {
                                    iArr2 = new int[i37];
                                } else if (iArr2.length < i37) {
                                    iArr2 = new int[Math.max(iArr2.length * 2, i37)];
                                }
                                ti1Var5.L = iArr2;
                                if (i36 == 2) {
                                    int i38 = (i35 - ti1Var5.N) - 4;
                                    int i39 = ti1Var5.K;
                                    Arrays.fill(iArr2, 0, i39, i38 / i39);
                                } else if (i36 == i17) {
                                    int i40 = 0;
                                    int i41 = 0;
                                    int i42 = 4;
                                    while (true) {
                                        int i43 = ti1Var5.K - i17;
                                        if (i40 < i43) {
                                            ti1Var5.L[i40] = 0;
                                            while (true) {
                                                i13 = i42 + 1;
                                                ti1Var5.a(pd0Var, i13);
                                                int i44 = ti1Var5.g.a[i42] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                int[] iArr3 = ti1Var5.L;
                                                i14 = iArr3[i40] + i44;
                                                iArr3[i40] = i14;
                                                if (i44 != 255) {
                                                    break;
                                                }
                                                i42 = i13;
                                            }
                                            i41 += i14;
                                            i40 += i17;
                                            i42 = i13;
                                        } else {
                                            ti1Var5.L[i43] = ((i35 - ti1Var5.N) - i42) - i41;
                                        }
                                    }
                                } else {
                                    if (i36 != 3) {
                                        throw new cc2(gg2.a(i36, "Unexpected lacing value: "), null, true, 1);
                                    }
                                    int i45 = 0;
                                    int i46 = 0;
                                    int i47 = 4;
                                    int i48 = i17;
                                    while (true) {
                                        int i49 = ti1Var5.K - i48;
                                        if (i45 < i49) {
                                            ti1Var5.L[i45] = i18;
                                            int i50 = i47 + 1;
                                            ti1Var5.a(pd0Var, i50);
                                            if (ti1Var5.g.a[i47] == 0) {
                                                boolean z5 = i48;
                                                throw new cc2("No valid varint length mask found", null, z5, z5 ? 1 : 0);
                                            }
                                            int i51 = i18;
                                            while (true) {
                                                if (i51 < 8) {
                                                    int i52 = i48 << (7 - i51);
                                                    if ((ti1Var5.g.a[i47] & i52) != 0) {
                                                        int i53 = i50 + i51;
                                                        ti1Var5.a(pd0Var, i53);
                                                        long j12 = ti1Var5.g.a[i47] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i52);
                                                        while (i50 < i53) {
                                                            j12 = (j12 << 8) | (ti1Var5.g.a[i50] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                                            i50++;
                                                            i46 = i46;
                                                        }
                                                        i12 = i46;
                                                        if (i45 > 0) {
                                                            j = j12 - ((1 << ((i51 * 7) + 6)) - 1);
                                                            i47 = i53;
                                                        } else {
                                                            i47 = i53;
                                                            j = j12;
                                                        }
                                                    } else {
                                                        i51 += i48;
                                                    }
                                                } else {
                                                    i12 = i46;
                                                    i47 = i50;
                                                    j = 0;
                                                }
                                            }
                                            if (j >= -2147483648L && j <= 2147483647L) {
                                                int i54 = (int) j;
                                                int[] iArr4 = ti1Var5.L;
                                                if (i45 != 0) {
                                                    i54 += iArr4[i45 - 1];
                                                }
                                                iArr4[i45] = i54;
                                                i45++;
                                                i48 = 1;
                                                i46 = i12 + i54;
                                                i18 = 0;
                                            }
                                        } else {
                                            ti1Var5.L[i49] = ((i35 - ti1Var5.N) - i47) - i46;
                                        }
                                    }
                                }
                            }
                            byte[] bArr2 = ti1Var5.g.a;
                            ti1Var5.H = ti1Var5.a((bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr2[0] << 8)) + ti1Var5.B;
                            ti1Var5.O = (si1Var2.d == 2 || (i34 == 163 && (ti1Var5.g.a[2] & 128) == 128)) ? 1 : 0;
                            ti1Var5.G = 2;
                            ti1Var5.J = 0;
                            i10 = 163;
                        } else {
                            i10 = 163;
                        }
                        if (i34 == i10) {
                            while (true) {
                                int i55 = ti1Var5.J;
                                if (i55 < ti1Var5.K) {
                                    ti1Var5.a(si1Var2, ti1Var5.H + ((ti1Var5.J * si1Var2.e) / 1000), ti1Var5.O, ti1Var5.a(pd0Var, si1Var2, ti1Var5.L[i55], false), 0);
                                    ti1Var5.J++;
                                } else {
                                    z4 = true;
                                    ti1Var5.G = 0;
                                    i11 = 0;
                                }
                            }
                        } else {
                            z4 = true;
                            while (true) {
                                int i56 = ti1Var5.J;
                                if (i56 < ti1Var5.K) {
                                    int[] iArr5 = ti1Var5.L;
                                    iArr5[i56] = ti1Var5.a(pd0Var, si1Var2, iArr5[i56], true);
                                    ti1Var5.J++;
                                } else {
                                    i11 = 0;
                                }
                            }
                        }
                        this.e = i11;
                        return z4;
                    }
                } else if (i34 != 165) {
                    if (i34 == 16877) {
                        ti1Var5.a(i34);
                        si1 si1Var3 = ti1Var5.u;
                        int i57 = si1Var3.g;
                        if (i57 != 1685485123 && i57 != 1685480259) {
                            pd0Var.a(i35);
                        } else {
                            byte[] bArr3 = new byte[i35];
                            si1Var3.N = bArr3;
                            pd0Var.a(bArr3, 0, i35, false);
                        }
                    } else if (i34 == 16981) {
                        ti1Var5.a(i34);
                        byte[] bArr4 = new byte[i35];
                        ti1Var5.u.i = bArr4;
                        pd0Var.a(bArr4, 0, i35, false);
                    } else if (i34 == 18402) {
                        byte[] bArr5 = new byte[i35];
                        pd0Var.a(bArr5, 0, i35, false);
                        ti1Var5.a(i34);
                        ti1Var5.u.j = new b83(i17, 0, 0, bArr5);
                    } else if (i34 == 21419) {
                        Arrays.fill(ti1Var5.i.a, (byte) 0);
                        pd0Var.a(ti1Var5.i.a, 4 - i35, i35, false);
                        ti1Var5.i.e(0);
                        ti1Var5.w = (int) ti1Var5.i.l();
                    } else if (i34 != 25506) {
                        if (i34 != 30322) {
                            throw new cc2(gg2.a(i34, "Unexpected id: "), null, i17, i17);
                        }
                        ti1Var5.a(i34);
                        byte[] bArr6 = new byte[i35];
                        ti1Var5.u.v = bArr6;
                        pd0Var.a(bArr6, 0, i35, false);
                    } else {
                        ti1Var5.a(i34);
                        byte[] bArr7 = new byte[i35];
                        ti1Var5.u.k = bArr7;
                        pd0Var.a(bArr7, 0, i35, false);
                    }
                } else if (ti1Var5.G == 2) {
                    si1 si1Var4 = (si1) ti1Var5.c.get(ti1Var5.M);
                    if (ti1Var5.P == 4 && "V_VP9".equals(si1Var4.b)) {
                        ti1Var5.n.c(i35);
                        pd0Var.a(ti1Var5.n.a, 0, i35, false);
                    } else {
                        pd0Var.a(i35);
                    }
                }
                i11 = 0;
                z4 = i17;
                this.e = i11;
                return z4;
            }
            pd0Var.a((int) this.g);
            this.e = 0;
            i16 = i16;
            i17 = i17;
        }
    }
}
