package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* loaded from: classes7.dex */
public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.zxing.datamatrix.detector.Detector] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.zxing.ResultPoint[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.google.zxing.ResultPoint] */
    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        BitMatrix sampleGrid;
        ResultPoint[] detect = this.rectangleDetector.detect();
        ResultPoint resultPoint4 = detect[0];
        ResultPoint resultPoint5 = detect[1];
        ResultPoint resultPoint6 = detect[2];
        ResultPoint resultPoint7 = detect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(transitionsBetween(resultPoint4, resultPoint5));
        arrayList.add(transitionsBetween(resultPoint4, resultPoint6));
        arrayList.add(transitionsBetween(resultPoint5, resultPoint7));
        arrayList.add(transitionsBetween(resultPoint6, resultPoint7));
        AnonymousClass1 anonymousClass1 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        ResultPointsAndTransitions resultPointsAndTransitions = (ResultPointsAndTransitions) arrayList.get(0);
        ResultPointsAndTransitions resultPointsAndTransitions2 = (ResultPointsAndTransitions) arrayList.get(1);
        HashMap hashMap = new HashMap();
        increment(hashMap, resultPointsAndTransitions.getFrom());
        increment(hashMap, resultPointsAndTransitions.getTo());
        increment(hashMap, resultPointsAndTransitions2.getFrom());
        increment(hashMap, resultPointsAndTransitions2.getTo());
        Object obj = null;
        Object obj2 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ?? r16 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                obj = r16;
            } else if (anonymousClass1 == null) {
                anonymousClass1 = r16;
            } else {
                obj2 = r16;
            }
        }
        if (anonymousClass1 == null || obj == null || obj2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ?? r5 = {anonymousClass1, obj, obj2};
        ResultPoint.orderBestPatterns(r5);
        ?? r6 = r5[0];
        ?? r17 = r5[1];
        ?? r52 = r5[2];
        if (!hashMap.containsKey(resultPoint4)) {
            resultPoint6 = resultPoint4;
        } else if (!hashMap.containsKey(resultPoint5)) {
            resultPoint6 = resultPoint5;
        } else if (hashMap.containsKey(resultPoint6)) {
            resultPoint6 = resultPoint7;
        }
        int transitions = transitionsBetween(r52, resultPoint6).getTransitions();
        int transitions2 = transitionsBetween(r6, resultPoint6).getTransitions();
        if ((transitions & 1) == 1) {
            transitions++;
        }
        int i = transitions + 2;
        if ((transitions2 & 1) == 1) {
            transitions2++;
        }
        int i2 = transitions2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            resultPoint = r6;
            ResultPoint correctTopRightRectangular = correctTopRightRectangular(r17, resultPoint, r52, resultPoint6, i, i2);
            if (correctTopRightRectangular != null) {
                resultPoint6 = correctTopRightRectangular;
            }
            int transitions3 = transitionsBetween(r52, resultPoint6).getTransitions();
            int transitions4 = transitionsBetween(resultPoint, resultPoint6).getTransitions();
            if ((transitions3 & 1) == 1) {
                transitions3++;
            }
            int i3 = transitions3;
            if ((transitions4 & 1) == 1) {
                transitions4++;
            }
            resultPoint2 = r17;
            resultPoint3 = r52;
            sampleGrid = sampleGrid(this.image, resultPoint3, resultPoint2, resultPoint, resultPoint6, i3, transitions4);
        } else {
            int min = Math.min(i2, i);
            resultPoint = r6;
            ResultPoint correctTopRight = correctTopRight(r17, resultPoint, r52, resultPoint6, min);
            if (correctTopRight != null) {
                resultPoint6 = correctTopRight;
            }
            int max = Math.max(transitionsBetween(r52, resultPoint6).getTransitions(), transitionsBetween(resultPoint, resultPoint6).getTransitions());
            int i4 = max + 1;
            if ((i4 & 1) == 1) {
                i4 = max + 2;
            }
            int i5 = i4;
            resultPoint2 = r17;
            resultPoint3 = r52;
            sampleGrid = sampleGrid(this.image, resultPoint3, resultPoint2, resultPoint, resultPoint6, i5, i5);
        }
        return new DetectorResult(sampleGrid, new ResultPoint[]{resultPoint3, resultPoint2, resultPoint, resultPoint6});
    }

    private ResultPoint correctTopRightRectangular(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float distance = distance(resultPoint, resultPoint2) / i;
        float distance2 = distance(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / distance2) * distance), resultPoint4.getY() + (distance * ((resultPoint4.getY() - resultPoint3.getY()) / distance2)));
        float distance3 = distance(resultPoint, resultPoint3) / i2;
        float distance4 = distance(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / distance4) * distance3), resultPoint4.getY() + (distance3 * ((resultPoint4.getY() - resultPoint2.getY()) / distance4)));
        if (!isValid(resultPoint5)) {
            if (!isValid(resultPoint6)) {
                return null;
            }
        } else if (!isValid(resultPoint6) || Math.abs(i - transitionsBetween(resultPoint3, resultPoint5).getTransitions()) + Math.abs(i2 - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) <= Math.abs(i - transitionsBetween(resultPoint3, resultPoint6).getTransitions()) + Math.abs(i2 - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) {
            return resultPoint5;
        }
        return resultPoint6;
    }

    private ResultPoint correctTopRight(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float f = i;
        float distance = distance(resultPoint, resultPoint2) / f;
        float distance2 = distance(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / distance2) * distance), resultPoint4.getY() + (distance * ((resultPoint4.getY() - resultPoint3.getY()) / distance2)));
        float distance3 = distance(resultPoint, resultPoint3) / f;
        float distance4 = distance(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / distance4) * distance3), resultPoint4.getY() + (distance3 * ((resultPoint4.getY() - resultPoint2.getY()) / distance4)));
        if (!isValid(resultPoint5)) {
            if (!isValid(resultPoint6)) {
                return null;
            }
        } else if (!isValid(resultPoint6) || Math.abs(transitionsBetween(resultPoint3, resultPoint5).getTransitions() - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) <= Math.abs(transitionsBetween(resultPoint3, resultPoint6).getTransitions() - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) {
            return resultPoint5;
        }
        return resultPoint6;
    }

    private boolean isValid(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.image.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.image.getHeight());
    }

    private static int distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void increment(Map<ResultPoint, Integer> map, ResultPoint resultPoint) {
        Integer num = map.get(resultPoint);
        map.put(resultPoint, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private ResultPointsAndTransitions transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        int i = 0;
        boolean z = Math.abs(y2 - y) > Math.abs(x2 - x);
        if (z) {
            y = x;
            x = y;
            y2 = x2;
            x2 = y2;
        }
        int abs = Math.abs(x2 - x);
        int abs2 = Math.abs(y2 - y);
        int i2 = (-abs) / 2;
        int i3 = y < y2 ? 1 : -1;
        int i4 = x >= x2 ? -1 : 1;
        boolean z2 = this.image.get(z ? y : x, z ? x : y);
        while (x != x2) {
            boolean z3 = this.image.get(z ? y : x, z ? x : y);
            if (z3 != z2) {
                i++;
                z2 = z3;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (y == y2) {
                    break;
                }
                y += i3;
                i2 -= abs;
            }
            x += i4;
        }
        return new ResultPointsAndTransitions(resultPoint, resultPoint2, i);
    }

    private static final class ResultPointsAndTransitions {
        private final ResultPoint from;
        private final ResultPoint to;
        private final int transitions;

        private ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.from = resultPoint;
            this.to = resultPoint2;
            this.transitions = i;
        }

        ResultPoint getFrom() {
            return this.from;
        }

        ResultPoint getTo() {
            return this.to;
        }

        int getTransitions() {
            return this.transitions;
        }

        public String toString() {
            return this.from + "/" + this.to + IOUtils.DIR_SEPARATOR_UNIX + this.transitions;
        }
    }

    private static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<ResultPointsAndTransitions> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ResultPointsAndTransitions resultPointsAndTransitions, ResultPointsAndTransitions resultPointsAndTransitions2) {
            return resultPointsAndTransitions.getTransitions() - resultPointsAndTransitions2.getTransitions();
        }
    }
}
