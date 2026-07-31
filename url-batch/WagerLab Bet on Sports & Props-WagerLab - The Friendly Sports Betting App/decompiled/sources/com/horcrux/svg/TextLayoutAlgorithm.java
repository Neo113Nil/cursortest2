package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.horcrux.svg.TextProperties;
import java.util.ArrayList;

/* loaded from: classes7.dex */
class TextLayoutAlgorithm {
    TextLayoutAlgorithm() {
    }

    class CharacterInformation {
        double advance;
        char character;
        TextView element;
        int index;
        double x = 0.0d;
        double y = 0.0d;
        double rotate = 0.0d;
        boolean hidden = false;
        boolean middle = false;
        boolean resolved = false;
        boolean xSpecified = false;
        boolean ySpecified = false;
        boolean addressable = true;
        boolean anchoredChunk = false;
        boolean rotateSpecified = false;
        boolean firstCharacterInResolvedDescendant = false;

        CharacterInformation(int i, char c) {
            this.index = i;
            this.character = c;
        }
    }

    class LayoutInput {
        boolean horizontal;
        TextView text;

        LayoutInput() {
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathView> arrayList, ArrayList<TextView> arrayList2, StringBuilder sb, View view, TextPathView textPathView) {
        int i = 0;
        if (view instanceof TSpanView) {
            TSpanView tSpanView = (TSpanView) view;
            String str = tSpanView.mContent;
            if (str == null) {
                while (i < tSpanView.getChildCount()) {
                    getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, tSpanView.getChildAt(i), textPathView);
                    i++;
                }
                return;
            } else {
                while (i < str.length()) {
                    arrayList2.add(tSpanView);
                    arrayList.add(textPathView);
                    i++;
                }
                sb.append(str);
                return;
            }
        }
        ArrayList<TextView> arrayList3 = arrayList2;
        StringBuilder sb2 = sb;
        TextPathView textPathView2 = view instanceof TextPathView ? (TextPathView) view : textPathView;
        while (i < textPathView2.getChildCount()) {
            getSubTreeTypographicCharacterPositions(arrayList, arrayList3, sb2, textPathView2.getChildAt(i), textPathView2);
            i++;
            arrayList3 = arrayList2;
            sb2 = sb;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c2, code lost:
    
        if (r4 == com.horcrux.svg.TextProperties.Direction.ltr) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r4 == com.horcrux.svg.TextProperties.Direction.ltr) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
    
        r11 = r11 - r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        r11 = r11 - r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.Canvas, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharacterInformation[] layoutText(LayoutInput layoutInput) {
        boolean z;
        double d;
        char c;
        TextView textView = layoutInput.text;
        StringBuilder sb = new StringBuilder();
        ArrayList<TextView> arrayList = new ArrayList<>();
        ArrayList<TextPathView> arrayList2 = new ArrayList<>();
        getSubTreeTypographicCharacterPositions(arrayList2, arrayList, sb, textView, null);
        char[] charArray = sb.toString().toCharArray();
        int length = charArray.length;
        final CharacterInformation[] characterInformationArr = new CharacterInformation[length];
        for (int i = 0; i < length; i++) {
            characterInformationArr[i] = new CharacterInformation(i, charArray[i]);
        }
        if (length != 0) {
            PointF[] pointFArr = new PointF[length];
            for (int i2 = 0; i2 < length; i2++) {
                pointFArr[i2] = new PointF(0.0f, 0.0f);
            }
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                characterInformationArr[i3].addressable = true;
                characterInformationArr[i3].middle = false;
                characterInformationArr[i3].anchoredChunk = i3 == 0;
                if (characterInformationArr[i3].addressable && !characterInformationArr[i3].middle) {
                    pointFArr[i3].set(0.0f, 0.0f);
                } else if (i3 > 0) {
                    pointFArr[i3].set(pointFArr[i3 - 1]);
                }
                i3++;
            }
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            new C1CharacterPositioningResolver(characterInformationArr, strArr, strArr2, new String[length], new String[length]);
            PointF pointF = new PointF(0.0f, 0.0f);
            for (int i4 = 0; i4 < length; i4++) {
                if (strArr[i4].equals("")) {
                    strArr[i4] = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                if (strArr2[i4].equals("")) {
                    strArr2[i4] = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                pointF.x += Float.parseFloat(strArr[i4]);
                pointF.y += Float.parseFloat(strArr2[i4]);
                characterInformationArr[i4].x = pointFArr[i4].x + pointF.x;
                characterInformationArr[i4].y = pointFArr[i4].y + pointF.y;
            }
            new Object() { // from class: com.horcrux.svg.TextLayoutAlgorithm.1TextLengthResolver
                int global;

                /* JADX INFO: Access modifiers changed from: private */
                public void resolveTextLength(TextView textView2) {
                    int i5;
                    Class<?> cls = textView2.getClass();
                    boolean z2 = textView2.mTextLength != null;
                    if (cls == TSpanView.class && z2) {
                        TSpanView tSpanView = (TSpanView) textView2;
                        String str = tSpanView.mContent;
                        int i6 = this.global;
                        int length2 = (str == null ? 0 : str.length()) + i6;
                        double d2 = Double.NEGATIVE_INFINITY;
                        int i7 = i6;
                        double d3 = Double.POSITIVE_INFINITY;
                        while (i7 <= length2) {
                            if (characterInformationArr[i6].addressable) {
                                char c2 = characterInformationArr[i6].character;
                                if (c2 == '\n' || c2 == '\r') {
                                    return;
                                }
                                double d4 = characterInformationArr[i7].x;
                                double d5 = characterInformationArr[i7].advance + d4;
                                i5 = i6;
                                d3 = Math.min(d3, Math.min(d4, d5));
                                d2 = Math.max(d2, Math.max(d4, d5));
                            } else {
                                i5 = i6;
                            }
                            i7++;
                            i6 = i5;
                        }
                        int i8 = i6;
                        if (d3 != Double.POSITIVE_INFINITY) {
                            double d6 = textView2.mTextLength.value - (d2 - d3);
                            int i9 = 0;
                            int i10 = 0;
                            for (int i11 = 0; i11 < textView2.getChildCount(); i11++) {
                                if (((TextPathView) textView2.getChildAt(i11)).mTextLength == null) {
                                    String str2 = tSpanView.mContent;
                                    i9 += str2 == null ? 0 : str2.length();
                                } else {
                                    characterInformationArr[i9].firstCharacterInResolvedDescendant = true;
                                    i10++;
                                }
                            }
                            double d7 = d6 / (i9 + (i10 - 1));
                            double d8 = 0.0d;
                            for (int i12 = i8; i12 <= length2; i12++) {
                                characterInformationArr[i12].x += d8;
                                if (!characterInformationArr[i12].middle && (!characterInformationArr[i12].resolved || characterInformationArr[i12].firstCharacterInResolvedDescendant)) {
                                    d8 += d7;
                                }
                            }
                        }
                    }
                }
            }.resolveTextLength(textView);
            pointF.set(0.0f, 0.0f);
            int i5 = 1;
            while (i5 < length) {
                String str = strArr[i5];
                if (str != null) {
                    pointF.x = (float) (Double.parseDouble(str) - characterInformationArr[i5].x);
                }
                String str2 = strArr2[i5];
                if (str2 != null) {
                    pointF.y = (float) (Double.parseDouble(str2) - characterInformationArr[i5].y);
                }
                characterInformationArr[i5].x += pointF.x;
                characterInformationArr[i5].y += pointF.y;
                if (characterInformationArr[i5].middle && characterInformationArr[i5].anchoredChunk) {
                    characterInformationArr[i5].anchoredChunk = false;
                }
                i5++;
                if (i5 < length) {
                    characterInformationArr[i5].anchoredChunk = true;
                }
            }
            int i6 = 0;
            int i7 = 0;
            double d2 = Double.POSITIVE_INFINITY;
            double d3 = Double.NEGATIVE_INFINITY;
            double d4 = Double.POSITIVE_INFINITY;
            double d5 = Double.NEGATIVE_INFINITY;
            while (i6 < length) {
                if (characterInformationArr[i6].addressable) {
                    if (characterInformationArr[i6].anchoredChunk) {
                        d4 = d2;
                        d5 = d3;
                        d2 = Double.POSITIVE_INFINITY;
                        d3 = Double.NEGATIVE_INFINITY;
                    }
                    double d6 = characterInformationArr[i6].x;
                    double d7 = characterInformationArr[i6].advance + d6;
                    d2 = Math.min(d2, Math.min(d6, d7));
                    d3 = Math.max(d3, Math.max(d6, d7));
                    if ((i6 > 0 && characterInformationArr[i6].anchoredChunk && d4 != Double.POSITIVE_INFINITY) || i6 == length - 1) {
                        TextProperties.TextAnchor textAnchor = TextProperties.TextAnchor.start;
                        TextProperties.Direction direction = TextProperties.Direction.ltr;
                        int i8 = length - 1;
                        if (i6 == i8) {
                            d4 = d2;
                            d5 = d3;
                        }
                        double d8 = characterInformationArr[i7].x;
                        int i9 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
                        if (i9 != 1) {
                            if (i9 == 2) {
                                TextProperties.Direction direction2 = TextProperties.Direction.ltr;
                                d8 -= (d4 + d5) / 2.0d;
                            } else if (i9 == 3) {
                            }
                        }
                        int i10 = i6 == i8 ? i6 : i6 - 1;
                        for (int i11 = i7; i11 <= i10; i11++) {
                            characterInformationArr[i11].x += d8;
                        }
                        i7 = i6;
                    }
                }
                i6++;
            }
            int i12 = i7;
            PointF pointF2 = new PointF(0.0f, 0.0f);
            PathMeasure pathMeasure = new PathMeasure();
            ?? r4 = 0;
            Path path = null;
            boolean z2 = false;
            int i13 = 0;
            boolean z3 = false;
            while (i13 < length) {
                TextPathView textPathView = arrayList2.get(i13);
                if (textPathView != 0 && characterInformationArr[i13].addressable) {
                    path = textPathView.getTextPath(r4, r4);
                    if (!characterInformationArr[i13].middle) {
                        textPathView.getSide();
                        TextProperties.TextPathSide textPathSide = TextProperties.TextPathSide.right;
                        pathMeasure.setPath(path, false);
                        double length2 = pathMeasure.getLength();
                        double d9 = textPathView.getStartOffset().value;
                        double d10 = characterInformationArr[i13].advance;
                        double d11 = characterInformationArr[i13].x;
                        double d12 = characterInformationArr[i13].y;
                        double d13 = characterInformationArr[i13].rotate;
                        double d14 = d11 + (d10 / 2.0d) + d9;
                        if (!pathMeasure.isClosed() && (d14 < 0.0d || d14 > length2)) {
                            characterInformationArr[i13].hidden = true;
                        }
                        if (pathMeasure.isClosed()) {
                            TextProperties.TextAnchor textAnchor2 = TextProperties.TextAnchor.start;
                            TextProperties.Direction direction3 = TextProperties.Direction.ltr;
                            d = d14;
                            double d15 = characterInformationArr[i12].x;
                            int i14 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor2.ordinal()];
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 == 3) {
                                        if (direction3 != TextProperties.Direction.ltr) {
                                            c = 1;
                                            if (d < 0.0d || d > length2) {
                                                characterInformationArr[i13].hidden = true;
                                            }
                                        } else if (d < (-length2) || d > 0.0d) {
                                            c = 1;
                                            characterInformationArr[i13].hidden = true;
                                        }
                                        double d16 = d % length2;
                                        if (!characterInformationArr[i13].hidden) {
                                            pathMeasure.getPosTan((float) d16, new float[2], new float[2]);
                                            double atan2 = Math.atan2(r12[c], r12[0]) * 57.29577951308232d;
                                            double d17 = 90.0d + atan2;
                                            Math.cos(d17);
                                            Math.sin(d17);
                                            characterInformationArr[i13].rotate += atan2;
                                        }
                                    }
                                } else if (d < (-length2) / 2.0d || d > length2 / 2.0d) {
                                    c = 1;
                                    characterInformationArr[i13].hidden = true;
                                    double d162 = d % length2;
                                    if (!characterInformationArr[i13].hidden) {
                                    }
                                }
                            } else if (direction3 == TextProperties.Direction.ltr) {
                                if (d < 0.0d || d > length2) {
                                    c = 1;
                                    characterInformationArr[i13].hidden = true;
                                    double d1622 = d % length2;
                                    if (!characterInformationArr[i13].hidden) {
                                    }
                                }
                            } else if (d < (-length2) || d > 0.0d) {
                                c = 1;
                                characterInformationArr[i13].hidden = true;
                                double d16222 = d % length2;
                                if (!characterInformationArr[i13].hidden) {
                                }
                            }
                        } else {
                            d = d14;
                        }
                        c = 1;
                        double d162222 = d % length2;
                        if (!characterInformationArr[i13].hidden) {
                        }
                    } else {
                        int i15 = i13 - 1;
                        characterInformationArr[i13].x = characterInformationArr[i15].x;
                        characterInformationArr[i13].y = characterInformationArr[i15].y;
                        characterInformationArr[i13].rotate = characterInformationArr[i15].rotate;
                    }
                    z2 = true;
                }
                if (textPathView == 0 && characterInformationArr[i13].addressable) {
                    if (z2) {
                        pathMeasure.setPath(path, false);
                        float[] fArr = new float[2];
                        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
                        pointF2.set(fArr[0], fArr[1]);
                        z2 = false;
                        z3 = true;
                    }
                    if (!z3) {
                        z = z2;
                    } else if (characterInformationArr[i13].anchoredChunk) {
                        z3 = false;
                    } else {
                        z = z2;
                        characterInformationArr[i13].x += pointF2.x;
                        characterInformationArr[i13].y += pointF2.y;
                    }
                    z2 = z;
                }
                i13++;
                r4 = 0;
            }
        }
        return characterInformationArr;
    }

    /* renamed from: com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver, reason: invalid class name */
    class C1CharacterPositioningResolver {
        private int global;
        private boolean horizontal;
        private boolean in_text_path;
        private String[] resolve_dx;
        private String[] resolve_dy;
        private String[] resolve_x;
        private String[] resolve_y;
        private CharacterInformation[] result;

        private C1CharacterPositioningResolver(CharacterInformation[] characterInformationArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
            this.global = 0;
            this.horizontal = true;
            this.in_text_path = false;
            this.result = characterInformationArr;
            this.resolve_x = strArr;
            this.resolve_y = strArr2;
            this.resolve_dx = strArr3;
            this.resolve_dy = strArr4;
        }

        private void resolveCharacterPositioning(TextView textView) {
            boolean z = true;
            if (textView.getClass() == TextView.class || textView.getClass() == TSpanView.class) {
                int i = this.global;
                String[] strArr = new String[0];
                String[] strArr2 = new String[0];
                String[] strArr3 = new String[0];
                String[] strArr4 = new String[0];
                double[] dArr = new double[0];
                int max = !this.in_text_path ? Math.max(0, 0) : 0;
                String str = ((TSpanView) textView).mContent;
                int length = str == null ? 0 : str.length();
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i + i2;
                    if (this.result[i4].addressable) {
                        this.result[i4].anchoredChunk = i3 < max ? z : false;
                        if (i3 < 0) {
                            this.resolve_x[i4] = strArr[i3];
                        }
                        boolean z2 = this.in_text_path;
                        if (z2 && !this.horizontal) {
                            this.resolve_x[i] = "";
                        }
                        if (i3 < 0) {
                            this.resolve_y[i4] = strArr2[i3];
                        }
                        if (z2 && this.horizontal) {
                            this.resolve_y[i] = "";
                        }
                        if (i3 < 0) {
                            this.resolve_dx[i4] = strArr3[i3];
                        }
                        if (i3 < 0) {
                            this.resolve_dy[i4] = strArr4[i3];
                        }
                        if (i3 < 0) {
                            this.result[i4].rotate = dArr[i3];
                        }
                    }
                    i3++;
                    i2++;
                    z = true;
                }
                return;
            }
            if (textView.getClass() == TextPathView.class) {
                this.result[this.global].anchoredChunk = true;
                this.in_text_path = true;
                for (int i5 = 0; i5 < textView.getChildCount(); i5++) {
                    resolveCharacterPositioning((TextView) textView.getChildAt(i5));
                }
                if (textView instanceof TextPathView) {
                    this.in_text_path = false;
                }
            }
        }
    }

    /* renamed from: com.horcrux.svg.TextLayoutAlgorithm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;

        static {
            int[] iArr = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr;
            try {
                iArr[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
