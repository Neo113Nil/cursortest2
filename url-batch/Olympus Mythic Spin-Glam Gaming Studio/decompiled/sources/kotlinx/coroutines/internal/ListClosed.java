package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes6.dex */
final class ListClosed extends LockFreeLinkedListNode {
    public final int forbiddenElementsBitmask;

    public ListClosed(int i) {
        this.forbiddenElementsBitmask = i;
    }
}
