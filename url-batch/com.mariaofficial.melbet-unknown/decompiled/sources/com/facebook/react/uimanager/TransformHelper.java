package com.facebook.react.uimanager;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TransformHelper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J,\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u0083 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "<init>", "()V", "helperMatrix", "Ljava/lang/ThreadLocal;", "", "convertToRadians", "", "transformMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "processTransform", "", "transforms", "Lcom/facebook/react/bridge/ReadableArray;", "result", "viewWidth", "", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "allowPercentageResolution", "", "parseTranslateValue", "stringValue", "dimension", "getTranslateForTransformOrigin", "nativeProcessTransform", "Lcom/facebook/react/bridge/NativeArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformHelper {
    public static final TransformHelper INSTANCE = new TransformHelper();
    private static final ThreadLocal<double[]> helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    /* compiled from: TransformHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private TransformHelper() {
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d;
        boolean z = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            Intrinsics.checkNotNull(string);
            if (StringsKt.endsWith$default(string, "rad", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
            } else if (StringsKt.endsWith$default(string, "deg", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
                z = false;
            }
            d = Double.parseDouble(string);
        } else {
            d = transformMap.getDouble(key);
        }
        return z ? d : MatrixMathHelper.degreesToRadians(d);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(ReadableArray transforms, double[] result) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null, false);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0204, code lost:
    
        if (r13.equals("rotate") == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        int i;
        int i2;
        char c;
        double d;
        double d2;
        double d3;
        double[] dArr;
        double d4;
        double d5;
        double d6;
        double d7;
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        int i3 = 1;
        if (allowPercentageResolution && ReactNativeFeatureFlags.useNativeTransformHelperAndroid() && (transforms instanceof NativeArray)) {
            if (transformOrigin == 0 ? true : transformOrigin instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, viewWidth, viewHeight, (NativeArray) transformOrigin);
                return;
            }
        }
        double[] dArr2 = helperMatrix.get();
        Intrinsics.checkNotNull(dArr2);
        double[] dArr3 = dArr2;
        MatrixMathHelper.resetIdentityMatrix(result);
        double[] translateForTransformOrigin = INSTANCE.getTranslateForTransformOrigin(viewWidth, viewHeight, transformOrigin, allowPercentageResolution);
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            int size = transforms.size();
            for (int i4 = 0; i4 < size; i4++) {
                dArr3[i4] = transforms.getDouble(i4);
            }
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        } else {
            int size2 = transforms.size();
            int i5 = 0;
            while (i5 < size2) {
                ReadableMap map = transforms.getMap(i5);
                Intrinsics.checkNotNull(map);
                String nextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr3);
                int i6 = i5;
                switch (nextKey.hashCode()) {
                    case -1721943862:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals(ViewProps.TRANSLATE_X)) {
                            if (map.getType(nextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper = INSTANCE;
                                String string = map.getString(nextKey);
                                Intrinsics.checkNotNull(string);
                                d = transformHelper.parseTranslateValue(string, viewWidth);
                            } else {
                                d = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, d, 0.0d);
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1721943861:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals(ViewProps.TRANSLATE_Y)) {
                            if (map.getType(nextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper2 = INSTANCE;
                                String string2 = map.getString(nextKey);
                                Intrinsics.checkNotNull(string2);
                                d2 = transformHelper2.parseTranslateValue(string2, viewHeight);
                            } else {
                                d2 = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, 0.0d, d2);
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1081239615:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array);
                            for (int i7 = 0; i7 < 16; i7++) {
                                dArr3[i7] = array.getDouble(i7);
                            }
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -925180581:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        break;
                    case -908189618:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals(ViewProps.SCALE_X)) {
                            MatrixMathHelper.applyScaleX(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -908189617:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals(ViewProps.SCALE_Y)) {
                            MatrixMathHelper.applyScaleY(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109250890:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals("scale")) {
                            double d8 = map.getDouble(nextKey);
                            MatrixMathHelper.applyScaleX(dArr3, d8);
                            MatrixMathHelper.applyScaleY(dArr3, d8);
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493390:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals("skewX")) {
                            MatrixMathHelper.applySkewX(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493391:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals("skewY")) {
                            MatrixMathHelper.applySkewY(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 207960636:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        if (nextKey.equals("perspective")) {
                            MatrixMathHelper.applyPerspective(dArr3, map.getDouble(nextKey));
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1052832078:
                        if (nextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array2);
                            if (array2.getType(0) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper3 = INSTANCE;
                                String string3 = array2.getString(0);
                                Intrinsics.checkNotNull(string3);
                                d3 = transformHelper3.parseTranslateValue(string3, viewWidth);
                            } else {
                                d3 = array2.getDouble(0);
                            }
                            if (array2.getType(i3) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper4 = INSTANCE;
                                String string4 = array2.getString(i3);
                                Intrinsics.checkNotNull(string4);
                                dArr = dArr3;
                                d4 = transformHelper4.parseTranslateValue(string4, viewHeight);
                            } else {
                                dArr = dArr3;
                                d4 = array2.getDouble(i3);
                            }
                            if (array2.size() > 2) {
                                d7 = array2.getDouble(2);
                                double d9 = d4;
                                i2 = size2;
                                d5 = d3;
                                dArr3 = dArr;
                                d6 = d9;
                            } else {
                                double d10 = d4;
                                i2 = size2;
                                d5 = d3;
                                d6 = d10;
                                dArr3 = dArr;
                                d7 = 0.0d;
                            }
                            i = i3;
                            c = 16;
                            MatrixMathHelper.applyTranslate3D(dArr3, d5, d6, d7);
                            break;
                        }
                        i = i3;
                        i2 = size2;
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173149:
                        if (nextKey.equals("rotateX")) {
                            MatrixMathHelper.applyRotateX(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            i = i3;
                            i2 = size2;
                            c = 16;
                            break;
                        }
                        i = i3;
                        i2 = size2;
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173150:
                        if (nextKey.equals("rotateY")) {
                            MatrixMathHelper.applyRotateY(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            i = i3;
                            i2 = size2;
                            c = 16;
                            break;
                        }
                        i = i3;
                        i2 = size2;
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173151:
                        if (nextKey.equals("rotateZ")) {
                            i = i3;
                            i2 = size2;
                            c = 16;
                            MatrixMathHelper.applyRotateZ(dArr3, INSTANCE.convertToRadians(map, nextKey));
                            break;
                        }
                        i = i3;
                        i2 = size2;
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    default:
                        i = i3;
                        i2 = size2;
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                }
                MatrixMathHelper.multiplyInto(result, result, dArr3);
                i5 = i6 + 1;
                size2 = i2;
                i3 = i;
            }
        }
        int i8 = i3;
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, -translateForTransformOrigin[0], -translateForTransformOrigin[i8], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
    }

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            if (StringsKt.endsWith$default(stringValue, "%", false, 2, (Object) null)) {
                return (Double.parseDouble(StringsKt.dropLast(stringValue, 1)) * dimension) / 100.0d;
            }
            return Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            FLog.w(ReactConstants.TAG, "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        boolean z;
        int i;
        if (transformOrigin == null || (viewHeight == 0.0f && viewWidth == 0.0f)) {
            return null;
        }
        double d = viewWidth / 2.0d;
        double d2 = viewHeight / 2.0d;
        double[] dArr = new double[3];
        boolean z2 = false;
        dArr[0] = d;
        int i2 = 1;
        dArr[1] = d2;
        dArr[2] = 0.0d;
        int min = Math.min(transformOrigin.size(), 3);
        int i3 = 0;
        while (i3 < min) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i3).ordinal()];
            if (i4 != i2) {
                if (i4 == 2 && allowPercentageResolution) {
                    String string = transformOrigin.getString(i3);
                    Intrinsics.checkNotNull(string);
                    if (StringsKt.endsWith$default(string, "%", z2, 2, (Object) null)) {
                        double parseDouble = Double.parseDouble(StringsKt.dropLast(string, i2));
                        z = z2;
                        i = i2;
                        dArr[i3] = ((i3 == 0 ? viewWidth : viewHeight) * parseDouble) / 100.0d;
                    }
                }
                z = z2;
                i = i2;
            } else {
                z = z2;
                i = i2;
                dArr[i3] = transformOrigin.getDouble(i3);
            }
            i3++;
            z2 = z;
            i2 = i;
        }
        boolean z3 = z2;
        int i5 = i2;
        double d3 = (-d) + dArr[z3 ? 1 : 0];
        double d4 = (-d2) + dArr[i5];
        double d5 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z3 ? 1 : 0] = d3;
        dArr2[i5] = d4;
        dArr2[2] = d5;
        return dArr2;
    }
}
