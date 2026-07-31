package com.ysocorp.ysonetwork.utils;

import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.YNManager.Identifiable;
import com.ysocorp.ysonetwork.enums.YNEnumRequestStatus;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class YNQueue<T extends YNManager.Identifiable> {
    private final List<T> elements = new ArrayList();

    public void enqueue(T t) {
        this.elements.add(t);
    }

    public void dequeueElement(T t) {
        for (int size = this.elements.size() - 1; size >= 0; size--) {
            if (this.elements.get(size).id.equals(t.id)) {
                this.elements.remove(size);
            }
        }
    }

    public void moveFirstReadyElementToFront() {
        for (int i = 0; i < this.elements.size(); i++) {
            T t = this.elements.get(i);
            if (t.status == YNEnumRequestStatus.Ready) {
                this.elements.remove(i);
                this.elements.add(0, t);
                return;
            }
        }
    }

    public T peek() {
        if (this.elements.isEmpty()) {
            return null;
        }
        return this.elements.get(0);
    }

    public T getElementById(String str) {
        for (int i = 0; i < this.elements.size(); i++) {
            T t = this.elements.get(i);
            if (t.id.equals(str)) {
                return t;
            }
        }
        return null;
    }
}
