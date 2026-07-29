package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r3.mHorizontalChainStyle == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x004a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0048, code lost:
    
        if (r3.mVerticalChainStyle == 2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dd  */
    /* JADX WARN: Type inference failed for: r4v49, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget constraintWidget;
        LinearSystem linearSystem2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget3;
        int i3;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i4;
        SolverVariable solverVariable5;
        float f2;
        int size;
        int i5;
        float f3;
        ArrayList<ConstraintWidget> arrayList2;
        boolean z4;
        boolean z5;
        int i6;
        ConstraintWidget constraintWidget6 = chainHead.mFirst;
        ConstraintWidget constraintWidget7 = chainHead.mLast;
        ConstraintWidget constraintWidget8 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget9 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget10 = chainHead.mHead;
        float f4 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget11 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget12 = chainHead.mLastMatchConstraintWidget;
        boolean z6 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget10.mHorizontalChainStyle == 0;
            z2 = constraintWidget10.mHorizontalChainStyle == 1;
        } else {
            z = constraintWidget10.mVerticalChainStyle == 0;
            z2 = constraintWidget10.mVerticalChainStyle == 1;
        }
        ?? r7 = constraintWidget6;
        boolean z7 = false;
        while (true) {
            f = f4;
            if (z7) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r7.mListAnchors[i2];
            int i7 = z3 ? 1 : 4;
            int margin = constraintAnchor6.getMargin();
            boolean z8 = z6;
            boolean z9 = r7.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && r7.mResolvedMatchConstraintDefault[i] == 0;
            if (constraintAnchor6.mTarget != null && r7 != constraintWidget6) {
                margin += constraintAnchor6.mTarget.getMargin();
            }
            int i8 = margin;
            if (z3 && r7 != constraintWidget6 && r7 != constraintWidget8) {
                i7 = 5;
            }
            boolean z10 = z9;
            if (constraintAnchor6.mTarget != null) {
                if (r7 == constraintWidget8) {
                    z4 = z3;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, 6);
                } else {
                    z4 = z3;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, 8);
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, (!z10 || z4) ? i7 : 5);
            } else {
                z4 = z3;
                z5 = z;
            }
            if (z8) {
                if (r7.getVisibility() == 8 || r7.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    linearSystem.addGreaterThan(r7.mListAnchors[i2 + 1].mSolverVariable, r7.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r7.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i6, 8);
            }
            ConstraintAnchor constraintAnchor7 = r7.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor7 != null) {
                ?? r4 = constraintAnchor7.mOwner;
                if (r4.mListAnchors[i2].mTarget != null && r4.mListAnchors[i2].mTarget.mOwner == r7) {
                    r21 = r4;
                }
            }
            if (r21 != null) {
                r7 = r21;
            } else {
                z7 = true;
            }
            f4 = f;
            z6 = z8;
            z3 = z4;
            z = z5;
            r7 = r7;
        }
        boolean z11 = z6;
        boolean z12 = z3;
        boolean z13 = z;
        if (constraintWidget9 != null) {
            int i9 = i2 + 1;
            if (constraintWidget7.mListAnchors[i9].mTarget != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget9.mListAnchors[i9];
                if (constraintWidget9.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget9.mResolvedMatchConstraintDefault[i] == 0 && !z12 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor8.mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 5);
                } else if (z12 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor8.mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 4);
                }
                linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget7.mListAnchors[i9].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 6);
                if (z11) {
                    int i10 = i2 + 1;
                    linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i10].mSolverVariable, constraintWidget7.mListAnchors[i10].mSolverVariable, constraintWidget7.mListAnchors[i10].getMargin(), 8);
                }
                arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList != null && (size = arrayList.size()) > 1) {
                    float f5 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f : chainHead.mWidgetsMatchCount;
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    ConstraintWidget constraintWidget13 = null;
                    i5 = 0;
                    while (i5 < size) {
                        ConstraintWidget constraintWidget14 = arrayList.get(i5);
                        float f8 = constraintWidget14.mWeight[i];
                        if (f8 >= f6) {
                            f3 = f6;
                        } else if (chainHead.mHasComplexMatchWeights) {
                            f3 = f6;
                            linearSystem.addEquality(constraintWidget14.mListAnchors[i2 + 1].mSolverVariable, constraintWidget14.mListAnchors[i2].mSolverVariable, 0, 4);
                            arrayList2 = arrayList;
                            i5++;
                            f6 = f3;
                            arrayList = arrayList2;
                        } else {
                            f3 = f6;
                            f8 = 1.0f;
                        }
                        float f9 = f8;
                        if (f9 == f3) {
                            linearSystem.addEquality(constraintWidget14.mListAnchors[i2 + 1].mSolverVariable, constraintWidget14.mListAnchors[i2].mSolverVariable, 0, 8);
                            arrayList2 = arrayList;
                            i5++;
                            f6 = f3;
                            arrayList = arrayList2;
                        } else {
                            if (constraintWidget13 != null) {
                                SolverVariable solverVariable6 = constraintWidget13.mListAnchors[i2].mSolverVariable;
                                int i11 = i2 + 1;
                                SolverVariable solverVariable7 = constraintWidget13.mListAnchors[i11].mSolverVariable;
                                SolverVariable solverVariable8 = constraintWidget14.mListAnchors[i2].mSolverVariable;
                                arrayList2 = arrayList;
                                SolverVariable solverVariable9 = constraintWidget14.mListAnchors[i11].mSolverVariable;
                                ArrayRow createRow = linearSystem.createRow();
                                createRow.createRowEqualMatchDimensions(f7, f5, f9, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                                linearSystem.addConstraint(createRow);
                            } else {
                                arrayList2 = arrayList;
                            }
                            constraintWidget13 = constraintWidget14;
                            f7 = f9;
                            i5++;
                            f6 = f3;
                            arrayList = arrayList2;
                        }
                    }
                }
                if (constraintWidget8 == null && (constraintWidget8 == constraintWidget9 || z12)) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget6.mListAnchors[i2];
                    int i12 = i2 + 1;
                    ConstraintAnchor constraintAnchor10 = constraintWidget7.mListAnchors[i12];
                    SolverVariable solverVariable10 = constraintAnchor9.mTarget != null ? constraintAnchor9.mTarget.mSolverVariable : null;
                    SolverVariable solverVariable11 = constraintAnchor10.mTarget != null ? constraintAnchor10.mTarget.mSolverVariable : null;
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.mListAnchors[i2];
                    ConstraintAnchor constraintAnchor12 = constraintWidget9.mListAnchors[i12];
                    if (solverVariable10 != null && solverVariable11 != null) {
                        if (i == 0) {
                            f2 = constraintWidget10.mHorizontalBiasPercent;
                        } else {
                            f2 = constraintWidget10.mVerticalBiasPercent;
                        }
                        linearSystem.addCentering(constraintAnchor11.mSolverVariable, solverVariable10, constraintAnchor11.getMargin(), f2, solverVariable11, constraintAnchor12.mSolverVariable, constraintAnchor12.getMargin(), 7);
                    }
                } else if (z13 || constraintWidget8 == null) {
                    int i13 = 8;
                    if (z2 && constraintWidget8 != null) {
                        boolean z14 = chainHead.mWidgetsMatchCount <= 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                        ConstraintWidget constraintWidget15 = constraintWidget8;
                        constraintWidget = constraintWidget15;
                        while (constraintWidget != null) {
                            ConstraintWidget constraintWidget16 = constraintWidget.mNextChainWidget[i];
                            while (constraintWidget16 != null && constraintWidget16.getVisibility() == i13) {
                                constraintWidget16 = constraintWidget16.mNextChainWidget[i];
                            }
                            if (constraintWidget == constraintWidget8 || constraintWidget == constraintWidget9 || constraintWidget16 == null) {
                                constraintWidget2 = constraintWidget15;
                            } else {
                                if (constraintWidget16 == constraintWidget9) {
                                    constraintWidget16 = null;
                                }
                                ConstraintAnchor constraintAnchor13 = constraintWidget.mListAnchors[i2];
                                SolverVariable solverVariable12 = constraintAnchor13.mSolverVariable;
                                if (constraintAnchor13.mTarget != null) {
                                    SolverVariable solverVariable13 = constraintAnchor13.mTarget.mSolverVariable;
                                }
                                int i14 = i2 + 1;
                                SolverVariable solverVariable14 = constraintWidget15.mListAnchors[i14].mSolverVariable;
                                int margin2 = constraintAnchor13.getMargin();
                                int margin3 = constraintWidget.mListAnchors[i14].getMargin();
                                if (constraintWidget16 != null) {
                                    constraintAnchor4 = constraintWidget16.mListAnchors[i2];
                                    solverVariable = constraintAnchor4.mSolverVariable;
                                    solverVariable2 = constraintAnchor4.mTarget != null ? constraintAnchor4.mTarget.mSolverVariable : null;
                                } else {
                                    constraintAnchor4 = constraintWidget9.mListAnchors[i2];
                                    solverVariable = constraintAnchor4 != null ? constraintAnchor4.mSolverVariable : null;
                                    solverVariable2 = constraintWidget.mListAnchors[i14].mSolverVariable;
                                }
                                if (constraintAnchor4 != null) {
                                    margin3 += constraintAnchor4.getMargin();
                                }
                                int i15 = margin3;
                                if (constraintWidget15 != null) {
                                    margin2 += constraintWidget15.mListAnchors[i14].getMargin();
                                }
                                SolverVariable solverVariable15 = solverVariable;
                                int i16 = z14 ? 8 : 4;
                                if (solverVariable12 == null || solverVariable14 == null || solverVariable15 == null || solverVariable2 == null) {
                                    constraintWidget2 = constraintWidget15;
                                    constraintWidget3 = constraintWidget16;
                                } else {
                                    constraintWidget3 = constraintWidget16;
                                    SolverVariable solverVariable16 = solverVariable2;
                                    constraintWidget2 = constraintWidget15;
                                    linearSystem.addCentering(solverVariable12, solverVariable14, margin2, 0.5f, solverVariable15, solverVariable16, i15, i16);
                                }
                                constraintWidget16 = constraintWidget3;
                            }
                            if (constraintWidget.getVisibility() != 8) {
                                constraintWidget2 = constraintWidget;
                            }
                            constraintWidget = constraintWidget16;
                            constraintWidget15 = constraintWidget2;
                            i13 = 8;
                        }
                        linearSystem2 = linearSystem;
                        ConstraintAnchor constraintAnchor14 = constraintWidget8.mListAnchors[i2];
                        constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
                        int i17 = i2 + 1;
                        constraintAnchor2 = constraintWidget9.mListAnchors[i17];
                        constraintAnchor3 = constraintWidget7.mListAnchors[i17].mTarget;
                        if (constraintAnchor != null) {
                            if (constraintWidget8 != constraintWidget9) {
                                linearSystem2.addEquality(constraintAnchor14.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor14.getMargin(), 5);
                            } else if (constraintAnchor3 != null) {
                                linearSystem2.addCentering(constraintAnchor14.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor14.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                            }
                        }
                        if (constraintAnchor3 != null && constraintWidget8 != constraintWidget9) {
                            linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                        }
                        if ((z13 && !z2) || constraintWidget8 == null || constraintWidget8 == constraintWidget9) {
                            return;
                        }
                        ConstraintAnchor constraintAnchor15 = constraintWidget8.mListAnchors[i2];
                        int i18 = i2 + 1;
                        ConstraintAnchor constraintAnchor16 = constraintWidget9.mListAnchors[i18];
                        solverVariable5 = constraintAnchor15.mTarget == null ? constraintAnchor15.mTarget.mSolverVariable : null;
                        SolverVariable solverVariable17 = constraintAnchor16.mTarget == null ? constraintAnchor16.mTarget.mSolverVariable : null;
                        if (constraintWidget7 != constraintWidget9) {
                            ConstraintAnchor constraintAnchor17 = constraintWidget7.mListAnchors[i18];
                            solverVariable17 = constraintAnchor17.mTarget != null ? constraintAnchor17.mTarget.mSolverVariable : null;
                        }
                        if (constraintWidget8 == constraintWidget9) {
                            constraintAnchor15 = constraintWidget8.mListAnchors[i2];
                            constraintAnchor16 = constraintWidget8.mListAnchors[i18];
                        }
                        if (solverVariable5 != null || solverVariable17 == null) {
                            return;
                        }
                        int margin4 = constraintAnchor15.getMargin();
                        if (constraintWidget9 != null) {
                            constraintWidget7 = constraintWidget9;
                        }
                        linearSystem2.addCentering(constraintAnchor15.mSolverVariable, solverVariable5, margin4, 0.5f, solverVariable17, constraintAnchor16.mSolverVariable, constraintWidget7.mListAnchors[i18].getMargin(), 5);
                        return;
                    }
                } else {
                    boolean z15 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                    ConstraintWidget constraintWidget17 = constraintWidget8;
                    ConstraintWidget constraintWidget18 = constraintWidget17;
                    while (constraintWidget17 != null) {
                        ConstraintWidget constraintWidget19 = constraintWidget17.mNextChainWidget[i];
                        while (true) {
                            if (constraintWidget19 == null) {
                                i3 = 8;
                                break;
                            }
                            i3 = 8;
                            if (constraintWidget19.getVisibility() != 8) {
                                break;
                            } else {
                                constraintWidget19 = constraintWidget19.mNextChainWidget[i];
                            }
                        }
                        if (constraintWidget19 != null || constraintWidget17 == constraintWidget9) {
                            ConstraintAnchor constraintAnchor18 = constraintWidget17.mListAnchors[i2];
                            SolverVariable solverVariable18 = constraintAnchor18.mSolverVariable;
                            SolverVariable solverVariable19 = constraintAnchor18.mTarget != null ? constraintAnchor18.mTarget.mSolverVariable : null;
                            if (constraintWidget18 != constraintWidget17) {
                                solverVariable19 = constraintWidget18.mListAnchors[i2 + 1].mSolverVariable;
                            } else if (constraintWidget17 == constraintWidget8 && constraintWidget18 == constraintWidget17) {
                                solverVariable19 = constraintWidget6.mListAnchors[i2].mTarget != null ? constraintWidget6.mListAnchors[i2].mTarget.mSolverVariable : null;
                            }
                            int margin5 = constraintAnchor18.getMargin();
                            int i19 = i2 + 1;
                            int margin6 = constraintWidget17.mListAnchors[i19].getMargin();
                            if (constraintWidget19 != null) {
                                constraintAnchor5 = constraintWidget19.mListAnchors[i2];
                                solverVariable3 = constraintAnchor5.mSolverVariable;
                                solverVariable4 = constraintWidget17.mListAnchors[i19].mSolverVariable;
                            } else {
                                constraintAnchor5 = constraintWidget7.mListAnchors[i19].mTarget;
                                solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.mSolverVariable : null;
                                solverVariable4 = constraintWidget17.mListAnchors[i19].mSolverVariable;
                            }
                            if (constraintAnchor5 != null) {
                                margin6 += constraintAnchor5.getMargin();
                            }
                            if (constraintWidget18 != null) {
                                margin5 += constraintWidget18.mListAnchors[i19].getMargin();
                            }
                            if (solverVariable18 == null || solverVariable19 == null || solverVariable3 == null || solverVariable4 == null) {
                                constraintWidget4 = constraintWidget19;
                                constraintWidget5 = constraintWidget17;
                                i4 = 8;
                            } else {
                                if (constraintWidget17 == constraintWidget8) {
                                    margin5 = constraintWidget8.mListAnchors[i2].getMargin();
                                }
                                if (constraintWidget17 == constraintWidget9) {
                                    margin6 = constraintWidget9.mListAnchors[i19].getMargin();
                                }
                                constraintWidget4 = constraintWidget19;
                                constraintWidget5 = constraintWidget17;
                                i4 = 8;
                                linearSystem.addCentering(solverVariable18, solverVariable19, margin5, 0.5f, solverVariable3, solverVariable4, margin6, z15 ? 8 : 5);
                            }
                        } else {
                            constraintWidget4 = constraintWidget19;
                            constraintWidget5 = constraintWidget17;
                            i4 = i3;
                        }
                        if (constraintWidget5.getVisibility() != i4) {
                            constraintWidget18 = constraintWidget5;
                        }
                        constraintWidget17 = constraintWidget4;
                    }
                }
                linearSystem2 = linearSystem;
                if (z13) {
                }
                ConstraintAnchor constraintAnchor152 = constraintWidget8.mListAnchors[i2];
                int i182 = i2 + 1;
                ConstraintAnchor constraintAnchor162 = constraintWidget9.mListAnchors[i182];
                if (constraintAnchor152.mTarget == null) {
                }
                if (constraintAnchor162.mTarget == null) {
                }
                if (constraintWidget7 != constraintWidget9) {
                }
                if (constraintWidget8 == constraintWidget9) {
                }
                if (solverVariable5 != null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (z11) {
        }
        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null) {
            if (chainHead.mHasUndefinedWeights) {
            }
            float f62 = 0.0f;
            float f72 = 0.0f;
            ConstraintWidget constraintWidget132 = null;
            i5 = 0;
            while (i5 < size) {
            }
        }
        if (constraintWidget8 == null) {
        }
        if (z13) {
        }
        int i132 = 8;
        if (z2) {
            if (chainHead.mWidgetsMatchCount <= 0) {
            }
            ConstraintWidget constraintWidget152 = constraintWidget8;
            constraintWidget = constraintWidget152;
            while (constraintWidget != null) {
            }
            linearSystem2 = linearSystem;
            ConstraintAnchor constraintAnchor142 = constraintWidget8.mListAnchors[i2];
            constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
            int i172 = i2 + 1;
            constraintAnchor2 = constraintWidget9.mListAnchors[i172];
            constraintAnchor3 = constraintWidget7.mListAnchors[i172].mTarget;
            if (constraintAnchor != null) {
            }
            if (constraintAnchor3 != null) {
                linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
            }
            if (z13) {
            }
            ConstraintAnchor constraintAnchor1522 = constraintWidget8.mListAnchors[i2];
            int i1822 = i2 + 1;
            ConstraintAnchor constraintAnchor1622 = constraintWidget9.mListAnchors[i1822];
            if (constraintAnchor1522.mTarget == null) {
            }
            if (constraintAnchor1622.mTarget == null) {
            }
            if (constraintWidget7 != constraintWidget9) {
            }
            if (constraintWidget8 == constraintWidget9) {
            }
            if (solverVariable5 != null) {
            }
        }
        linearSystem2 = linearSystem;
        if (z13) {
        }
        ConstraintAnchor constraintAnchor15222 = constraintWidget8.mListAnchors[i2];
        int i18222 = i2 + 1;
        ConstraintAnchor constraintAnchor16222 = constraintWidget9.mListAnchors[i18222];
        if (constraintAnchor15222.mTarget == null) {
        }
        if (constraintAnchor16222.mTarget == null) {
        }
        if (constraintWidget7 != constraintWidget9) {
        }
        if (constraintWidget8 == constraintWidget9) {
        }
        if (solverVariable5 != null) {
        }
    }
}
