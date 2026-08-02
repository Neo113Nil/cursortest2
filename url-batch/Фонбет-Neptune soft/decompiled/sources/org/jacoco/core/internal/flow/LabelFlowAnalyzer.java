package org.jacoco.core.internal.flow;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes3.dex */
public final class LabelFlowAnalyzer extends MethodVisitor {
    boolean first;
    Label lineStart;
    boolean successor;

    public static void markLabels(MethodNode methodNode) {
        LabelFlowAnalyzer labelFlowAnalyzer = new LabelFlowAnalyzer();
        int size = methodNode.tryCatchBlocks.size();
        while (true) {
            size--;
            if (size >= 0) {
                methodNode.tryCatchBlocks.get(size).accept(labelFlowAnalyzer);
            } else {
                methodNode.instructions.accept(labelFlowAnalyzer);
                return;
            }
        }
    }

    public LabelFlowAnalyzer() {
        super(589824);
        this.successor = false;
        this.first = true;
        this.lineStart = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        LabelInfo.setTarget(label);
        LabelInfo.setTarget(label3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        LabelInfo.setTarget(label);
        if (i == 168) {
            throw new AssertionError("Subroutines not supported.");
        }
        this.successor = i != 167;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        if (this.first) {
            LabelInfo.setTarget(label);
        }
        if (this.successor) {
            LabelInfo.setSuccessor(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        this.lineStart = label;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    private void visitSwitchInsn(Label label, Label[] labelArr) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        setTargetIfNotDone(label);
        for (Label label2 : labelArr) {
            setTargetIfNotDone(label2);
        }
        this.successor = false;
        this.first = false;
    }

    private static void setTargetIfNotDone(Label label) {
        if (LabelInfo.isDone(label)) {
            return;
        }
        LabelInfo.setTarget(label);
        LabelInfo.setDone(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        if (i == 169) {
            throw new AssertionError("Subroutines not supported.");
        }
        if (i != 191) {
            switch (i) {
                case Opcodes.IRETURN /* 172 */:
                case Opcodes.LRETURN /* 173 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.RETURN /* 177 */:
                    break;
                default:
                    this.successor = true;
                    break;
            }
            this.first = false;
        }
        this.successor = false;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    private void markMethodInvocationLine() {
        Label label = this.lineStart;
        if (label != null) {
            LabelInfo.setMethodInvocationLine(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.successor = true;
        this.first = false;
    }
}
