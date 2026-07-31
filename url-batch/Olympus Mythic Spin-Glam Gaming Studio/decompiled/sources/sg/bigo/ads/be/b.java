package sg.bigo.ads.be;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.be.a;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes15.dex */
public final class b extends a {
    public b(@NonNull e.c cVar, @Nullable Map<String, Object> map, Context context, a.InterfaceC1847a interfaceC1847a) {
        super(cVar, map, context, interfaceC1847a);
    }

    @Override // sg.bigo.ads.be.a
    public final View b() {
        View a = sg.bigo.ads.common.utils.a.a(this.h, sg.bigo.ads.common.form.render.a.a(2), null, false);
        this.i = a;
        if (a == null) {
            return null;
        }
        a.a((TextView) a.findViewById(R.id.inter_form_edit_title), this.d);
        a(1);
        final EditText editText = (EditText) this.i.findViewById(R.id.inter_form_edit_content);
        String a2 = sg.bigo.ads.common.form.a.a(this.e, this.b);
        if (editText != null) {
            editText.setTextColor(sg.bigo.ads.common.form.render.a.b());
            editText.setHint(sg.bigo.ads.common.form.a.a(this.h, R.string.bigo_ad_form_question_hint));
            if (!r.a((CharSequence) a2)) {
                a.InterfaceC1847a interfaceC1847a = this.j;
                if (interfaceC1847a != null) {
                    interfaceC1847a.a(this.a.d, a2);
                }
                this.c = a2;
                editText.setText(a2);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.be.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    b.this.c = editText.getText().toString();
                    b bVar = b.this;
                    a.InterfaceC1847a interfaceC1847a2 = bVar.j;
                    if (interfaceC1847a2 != null) {
                        interfaceC1847a2.a(bVar.a.d, bVar.c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.be.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    b bVar = b.this;
                    if (z) {
                        bVar.a(2);
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this.i;
    }
}
