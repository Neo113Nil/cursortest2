package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    LowmcConstants() {
    }

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    static int[] ReadFromProperty(Properties properties, String str, int i) {
        byte[] decode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < decode.length / 4; i2++) {
            iArr[i2] = Pack.littleEndianToInt(decode, i2 * 4);
        }
        return iArr;
    }

    static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        int[] iArr = new int[readInt];
        for (int i = 0; i != readInt; i++) {
            iArr[i] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) != ',') {
                byteArrayOutputStream.write(str.charAt(i));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        if (picnicEngine.stateSizeBits != 128) {
            if (picnicEngine.stateSizeBits != 129) {
                if (picnicEngine.stateSizeBits != 192) {
                    if (picnicEngine.stateSizeBits != 255) {
                        if (picnicEngine.stateSizeBits != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.KMatrix_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.KMatrix;
        return GET_MAT(kMatrices, i);
    }

    protected KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        if (picnicEngine.stateSizeBits == 129 || ((picnicEngine.stateSizeBits == 192 && picnicEngine.numRounds == 4) || picnicEngine.stateSizeBits == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        if (picnicEngine.stateSizeBits != 128) {
            if (picnicEngine.stateSizeBits != 129) {
                if (picnicEngine.stateSizeBits != 192) {
                    if (picnicEngine.stateSizeBits != 255) {
                        if (picnicEngine.stateSizeBits != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.LMatrix_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.LMatrix;
        return GET_MAT(kMatrices, i);
    }

    protected KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i) {
        if (picnicEngine.stateSizeBits == 129 || ((picnicEngine.stateSizeBits == 192 && picnicEngine.numRounds == 4) || picnicEngine.stateSizeBits == 255)) {
            return GET_MAT(this.LMatrix_inv, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        if (picnicEngine.stateSizeBits != 128) {
            if (picnicEngine.stateSizeBits != 129) {
                if (picnicEngine.stateSizeBits != 192) {
                    if (picnicEngine.stateSizeBits != 255) {
                        if (picnicEngine.stateSizeBits != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.RConstants_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.RConstants;
        return GET_MAT(kMatrices, i);
    }
}
