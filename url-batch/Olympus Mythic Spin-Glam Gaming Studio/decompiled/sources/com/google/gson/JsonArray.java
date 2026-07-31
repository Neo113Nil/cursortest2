package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class JsonArray extends JsonElement implements Iterable {
    private final List elements = new ArrayList();

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.elements.iterator();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements));
    }

    public int hashCode() {
        return this.elements.hashCode();
    }
}
