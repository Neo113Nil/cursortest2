package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.V5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class X5 {
    private final Context a;
    private final C4622e5 b;
    private final W5 c;
    private final Pb d;
    private final InterfaceC4986y7 e = Kb.Y().a();

    public X5(Context context, C4622e5 c4622e5, W5 w5, Pb pb) {
        this.a = context;
        this.b = c4622e5;
        this.c = w5;
        this.d = pb;
    }

    public void a(C5005z8 c5005z8, String str, int i, int i2, Pc pc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(V5.a.a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(Z3.A);
        }
        if (!T3.h(this.a)) {
            throw new Exception(Z3.C);
        }
        this.c.a(c5005z8.getPath(), new a(pc));
        if (!c5005z8.exists()) {
            this.b.a(c5005z8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c5005z8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(C5005z8 c5005z8) throws Exception {
        if (c5005z8.exists()) {
            ArrayList<C5005z8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c5005z8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c5005z8) || !c5005z8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C5005z8 c5005z8) throws Exception {
        if (c5005z8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c5005z8, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C5005z8 c5005z8) throws Exception {
        if (c5005z8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c5005z8);
        }
        throw new Exception("Folder does not exist");
    }

    class a implements Pc {
        final /* synthetic */ Pc a;

        /* renamed from: com.ironsource.X5$a$a, reason: collision with other inner class name */
        class C0355a extends JSONObject {
            C0355a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(Pc pc) {
            this.a = pc;
        }

        @Override // com.ironsource.Pc
        public void a(C5005z8 c5005z8) {
            this.a.a(c5005z8);
            try {
                X5.this.d.a(c5005z8.getName(), SafeIronSourceIronsourceBridge.com_ironsource_X5$a$a_jsonObjectInit(this));
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Pc
        public void a(C5005z8 c5005z8, C4840q8 c4840q8) {
            this.a.a(c5005z8, c4840q8);
        }
    }

    public void a(C5005z8 c5005z8) throws Exception {
        if (c5005z8.exists()) {
            if (c5005z8.delete()) {
                this.d.a(c5005z8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C5005z8 c5005z8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c5005z8.exists()) {
                if (!this.d.b(c5005z8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
