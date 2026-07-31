package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JsonObject extends JsonElement {
    private final LinkedTreeMap members = new LinkedTreeMap();

    public void add(String str, JsonElement jsonElement) {
        LinkedTreeMap linkedTreeMap = this.members;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public Set entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members));
    }

    public int hashCode() {
        return this.members.hashCode();
    }
}
