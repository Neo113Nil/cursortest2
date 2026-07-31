package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
abstract class A {
    private static final String[] a = {"io.bidmachine", "com.explorestack"};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Descriptors.FieldDescriptor.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, MessageOrBuilder messageOrBuilder) {
        return String.format("[%s] %s", str, a(messageOrBuilder));
    }

    static void b(final String str, final MessageOrBuilder messageOrBuilder) {
        if (messageOrBuilder != null) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.A$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a2;
                    a2 = A.a(str, messageOrBuilder);
                    return a2;
                }
            });
        }
    }

    private static JSONObject a(MessageOrBuilder messageOrBuilder) {
        return messageOrBuilder instanceof Any ? a((Any) messageOrBuilder) : a((Map) messageOrBuilder.getAllFields());
    }

    private static JSONArray a(Descriptors.FieldDescriptor fieldDescriptor, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(jSONArray, a(fieldDescriptor, it.next()));
        }
        return jSONArray;
    }

    private static JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            a(jSONObject, fieldDescriptor.getName(), a(fieldDescriptor, entry.getValue()));
        }
        return jSONObject;
    }

    private static Object a(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        try {
            if (fieldDescriptor.isRepeated() && (obj instanceof List)) {
                return a(fieldDescriptor, (List) obj);
            }
            switch (a.a[fieldDescriptor.getJavaType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return obj;
                case 7:
                    return a(obj);
                case 8:
                    return ((Descriptors.GenericDescriptor) obj).getName();
                case 9:
                    return a((MessageOrBuilder) obj);
                default:
                    return "Unsupported type";
            }
        } catch (Throwable unused) {
            return "Parsing error";
        }
    }

    private static JSONObject a(Any any) {
        String str = any.getTypeUrl().split("/")[r0.length - 1];
        for (String str2 : a) {
            try {
                return a((MessageOrBuilder) any.unpack(Class.forName(str2 + str.substring(str.indexOf(".")))));
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    private static void a(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    private static String a(Object obj) {
        if (obj instanceof ByteString) {
            return TextFormat.escapeBytes((ByteString) obj);
        }
        return TextFormat.escapeBytes((byte[]) obj);
    }
}
