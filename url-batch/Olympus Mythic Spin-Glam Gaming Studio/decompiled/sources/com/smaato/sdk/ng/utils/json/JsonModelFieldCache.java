package com.smaato.sdk.ng.utils.json;

import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class JsonModelFieldCache {
    private static final Map<String, HashMap<String, JsonModel.JsonModelMetadata>> cachedModels = new HashMap();

    public static boolean checkIfModelCached(Class<?> cls) {
        Map<String, HashMap<String, JsonModel.JsonModelMetadata>> map = cachedModels;
        return map.containsKey(cls.getName()) && map.get(cls.getName()) != null;
    }

    public static HashMap<String, JsonModel.JsonModelMetadata> getFields(Class<?> cls) {
        return cachedModels.get(cls.getName());
    }

    public static void setFields(Class<?> cls, HashMap<String, JsonModel.JsonModelMetadata> hashMap) {
        cachedModels.put(cls.getName(), hashMap);
    }
}
