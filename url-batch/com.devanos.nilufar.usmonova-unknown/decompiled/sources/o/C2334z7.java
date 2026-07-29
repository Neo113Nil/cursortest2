package o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: o.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334z7 {
    public final long a;

    public C2334z7(long j) {
        this.a = j;
    }

    public static C2334z7 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C2334z7(Long.parseLong(jsonReader.nextString())) : new C2334z7(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2334z7) && this.a == ((C2334z7) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
