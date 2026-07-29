package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class K20 extends E20 {
    public final /* synthetic */ TO a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K20(TO to, Looper looper) {
        super(looper);
        this.a = to;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        TO to = this.a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new Q20());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof T20) {
                        to.g = (T20) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        to.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = TO.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        to.b(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (to.a) {
                        int i = 0;
                        while (true) {
                            try {
                                GR gr = to.a;
                                if (i < gr.j) {
                                    to.b((String) gr.e(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                to.b(str, intent2.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
