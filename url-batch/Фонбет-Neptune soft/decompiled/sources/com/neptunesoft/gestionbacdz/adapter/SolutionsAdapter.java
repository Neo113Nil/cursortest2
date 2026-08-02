package com.neptunesoft.gestionbacdz.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.SplashScreen;
import com.neptunesoft.gestionbacdz.TopicsSolutionsActivity;
import com.neptunesoft.gestionbacdz.adapter.SolutionsAdapter;
import com.neptunesoft.gestionbacdz.classobjects.Separate;
import com.neptunesoft.gestionbacdz.classobjects.Solutions;
import com.neptunesoft.gestionbacdz.fragment.SolutionsFragment;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class SolutionsAdapter extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static List list;
    static SolutionsHolder solutionsHolder;

    public SolutionsAdapter(List list2) {
        list = list2;
    }

    private static Solutions prepareSolutions(Solutions solutions) {
        if (SplashScreen.darkmode) {
            return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle_dark);
        }
        return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle);
    }

    public static void change() {
        Solutions prepareSolutions;
        switch (solutionsHolder.getBindingAdapterPosition()) {
            case 1:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 2:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 3:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 4:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 5:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 6:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 7:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 8:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 9:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 10:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 11:
            case 22:
            case 33:
            case 44:
            case 55:
            case 66:
            case 77:
            case 98:
            case 109:
            case 120:
            case Opcodes.LXOR /* 131 */:
            case Opcodes.D2I /* 142 */:
            default:
                prepareSolutions = null;
                break;
            case 12:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 13:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 14:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 15:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 16:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 17:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 18:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 19:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 20:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 21:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 23:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 24:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 25:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 26:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 27:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 28:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 29:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 30:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 31:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 32:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 34:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 35:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 36:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 37:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 38:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 39:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 40:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 41:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 42:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 43:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 45:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 46:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 47:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 48:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 49:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 50:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 51:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 52:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 53:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 54:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 56:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 57:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 58:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 59:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 60:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 61:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 62:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 63:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 64:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 65:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 67:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 68:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 69:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 70:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 71:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 72:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 73:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 74:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 75:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 76:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 78:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 79:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 80:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 81:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 82:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 83:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 84:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 85:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 86:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 87:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 88:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 89:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 90:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 91:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 92:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 93:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 94:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 95:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0));
                break;
            case 96:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 97:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 99:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 100:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 101:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 102:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 103:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 104:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 105:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 106:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 107:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 108:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 110:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 111:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 112:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 113:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 114:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 115:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 116:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 117:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 118:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 119:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 121:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 122:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 123:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 124:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 125:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 126:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case 127:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 128:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.LOR /* 129 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 130:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IINC /* 132 */:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2L /* 133 */:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2F /* 134 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2D /* 135 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2I /* 136 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2F /* 137 */:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2D /* 138 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2I /* 139 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.F2L /* 140 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2D /* 141 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2L /* 143 */:
                prepareSolutions = prepareSolutions(new Solutions("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2F /* 144 */:
                prepareSolutions = prepareSolutions(new Solutions("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2B /* 145 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2C /* 146 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2S /* 147 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LCMP /* 148 */:
                prepareSolutions = prepareSolutions(new Solutions("القانون", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPL /* 149 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPG /* 150 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.DCMPL /* 151 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPG /* 152 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
        }
        SolutionsFragment.list.set(solutionsHolder.getBindingAdapterPosition(), prepareSolutions);
        list.set(solutionsHolder.getBindingAdapterPosition(), prepareSolutions);
        solutionsHolder.imgItemTopicsSolutions.setImageResource(prepareSolutions.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            return new SeparatesHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_separate_years, parent, false));
        }
        final SolutionsHolder solutionsHolder2 = new SolutionsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topics_solutions, parent, false));
        solutionsHolder = solutionsHolder2;
        solutionsHolder2.lytItemTopicsSolution.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.adapter.SolutionsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SolutionsAdapter.lambda$onCreateViewHolder$0(SolutionsAdapter.SolutionsHolder.this, view);
            }
        });
        return solutionsHolder2;
    }

    static /* synthetic */ void lambda$onCreateViewHolder$0(SolutionsHolder solutionsHolder2, View view) {
        String str;
        TopicsSolutionsActivity.topics = false;
        solutionsHolder = solutionsHolder2;
        switch (solutionsHolder2.getBindingAdapterPosition()) {
            case 1:
                str = "bac2024-gestion-ge-correction.pdf";
                break;
            case 2:
                str = "bac2024-economy-ge-correction.pdf";
                break;
            case 3:
                str = "bac2024-math-ge-correction.pdf";
                break;
            case 4:
                str = "bac2024-hisgeo-ge-correction.pdf";
                break;
            case 5:
                str = "bac2024-arabic-sci-correction.pdf";
                break;
            case 6:
                str = "bac2024-droit-ge-correction.pdf";
                break;
            case 7:
                str = "bac2024-islamic-correction.pdf";
                break;
            case 8:
                str = "bac2024-philo-gemt-correction.pdf";
                break;
            case 9:
                str = "bac2024-english-sci-correction.pdf";
                break;
            case 10:
                str = "bac2024-french-sci-correction.pdf";
                break;
            case 11:
            case 22:
            case 33:
            case 44:
            case 55:
            case 66:
            case 77:
            case 98:
            case 109:
            case 120:
            case Opcodes.LXOR /* 131 */:
            case Opcodes.D2I /* 142 */:
            default:
                str = null;
                break;
            case 12:
                str = "bac2023-gestion-ge-correction.pdf";
                break;
            case 13:
                str = "bac2023-economy-ge-correction.pdf";
                break;
            case 14:
                str = "bac2023-math-ge-correction.pdf";
                break;
            case 15:
                str = "bac2023-hisgeo-ge-correction.pdf";
                break;
            case 16:
                str = "bac2023-arabic-sci-correction.pdf";
                break;
            case 17:
                str = "bac2023-droit-ge-correction.pdf";
                break;
            case 18:
                str = "bac2023-islamic-correction.pdf";
                break;
            case 19:
                str = "bac2023-philo-gemt-correction.pdf";
                break;
            case 20:
                str = "bac2023-english-sci-correction.pdf";
                break;
            case 21:
                str = "bac2023-french-sci-correction.pdf";
                break;
            case 23:
                str = "bac2022-gestion-ge_correction.pdf";
                break;
            case 24:
                str = "bac2022-economy-ge_correction.pdf";
                break;
            case 25:
                str = "bac2022-math-ge_correction.pdf";
                break;
            case 26:
                str = "bac2022-hisgeo-ge_correction.pdf";
                break;
            case 27:
                str = "bac2022-arabic-sci_correction.pdf";
                break;
            case 28:
                str = "bac2022-droit-ge_correction.pdf";
                break;
            case 29:
                str = "bac2022-islamic_correction.pdf";
                break;
            case 30:
                str = "bac2022-philo-gemt_correction.pdf";
                break;
            case 31:
                str = "bac2022-english-sci_correction.pdf";
                break;
            case 32:
                str = "bac2022-french-sci_correction.pdf";
                break;
            case 34:
                str = "bac-comptabilite-sujet-solution-2021.pdf";
                break;
            case 35:
                str = "bac-economie-sujet-solution-2021.pdf";
                break;
            case 36:
                str = "bac-mathematiques-ges-solution-2021.pdf";
                break;
            case 37:
                str = "bac-hisgeo-ges-solution-2021.pdf";
                break;
            case 38:
                str = "bac-arabe-sci-solution-2021.pdf";
                break;
            case 39:
                str = "bac-droit-sujet-solution-2021.pdf";
                break;
            case 40:
                str = "bac-islamia-sujet-solution-2021.pdf";
                break;
            case 41:
                str = "bac-philosophie-gemt-solution-2021.pdf";
                break;
            case 42:
                str = "bac-anglais-sci-solution-2021.pdf";
                break;
            case 43:
                str = "bac-francais-sci-solution-2021.pdf";
                break;
            case 45:
                str = "bac-comptabilite-sujet-solution-2020.pdf";
                break;
            case 46:
                str = "bac-economie-sujet-solution-2020.pdf";
                break;
            case 47:
                str = "bac-mathematiques-ges-solution-2020.pdf";
                break;
            case 48:
                str = "bac-hisgeo-ges-solution-2020.pdf";
                break;
            case 49:
                str = "bac-arabe-sci-solution-2020.pdf";
                break;
            case 50:
                str = "bac-droit-sujet-solution-2020.pdf";
                break;
            case 51:
                str = "bac-islamia-sujet-solution-2020.pdf";
                break;
            case 52:
                str = "bac-philosophie-gemt-solution-2020.pdf";
                break;
            case 53:
                str = "bac-anglais-sci-solution-2020.pdf";
                break;
            case 54:
                str = "bac-francais-sci-solution-2020.pdf";
                break;
            case 56:
                str = "bac-comptabilite-sujet-solution-2019.pdf";
                break;
            case 57:
                str = "bac-economie-sujet-solution-2019.pdf";
                break;
            case 58:
                str = "bac-mathematiques-ges-solution-2019.pdf";
                break;
            case 59:
                str = "bac-hisgeo-ges-solution-2019.pdf";
                break;
            case 60:
                str = "bac-arabe-sci-solution-2019.pdf";
                break;
            case 61:
                str = "bac-droit-sujet-solution-2019.pdf";
                break;
            case 62:
                str = "bac-islamia-sujet-solution-2019.pdf";
                break;
            case 63:
                str = "bac-philosophie-gemt-solution-2019.pdf";
                break;
            case 64:
                str = "bac-anglais-sci-solution-2019.pdf";
                break;
            case 65:
                str = "bac-francais-sci-solution-2019.pdf";
                break;
            case 67:
                str = "bac-comptabilite-sujet-solution-2018.pdf";
                break;
            case 68:
                str = "bac-economie-sujet-solution-2018.pdf";
                break;
            case 69:
                str = "bac-mathematiques-ges-solution-2018.pdf";
                break;
            case 70:
                str = "bac-hisgeo-ges-solution-2018.pdf";
                break;
            case 71:
                str = "bac-arabe-sci-solution-2018.pdf";
                break;
            case 72:
                str = "bac-droit-sujet-solution-2018.pdf";
                break;
            case 73:
                str = "bac-islamia-sujet-solution-2018.pdf";
                break;
            case 74:
                str = "bac-philosophie-gemt-solution-2018.pdf";
                break;
            case 75:
                str = "bac-anglais-sci-solution-2018.pdf";
                break;
            case 76:
                str = "bac-francais-sci-solution-2018.pdf";
                break;
            case 78:
                str = "bac-comptabilite-sujet-solution-2017-2.pdf";
                break;
            case 79:
                str = "bac-economie-sujet-solution-2017-2.pdf";
                break;
            case 80:
                str = "bac-mathematiques-ges-solution-2017-2.pdf";
                break;
            case 81:
                str = "bac-hisgeo-ges-solution-2017-2.pdf";
                break;
            case 82:
                str = "bac-arabe-sci-solution-2017-2.pdf";
                break;
            case 83:
                str = "bac-droit-sujet-solution-2017-2.pdf";
                break;
            case 84:
                str = "bac-islamia-sujet-solution-2017-2.pdf";
                break;
            case 85:
                str = "bac-philosophie-gemt-solution-2017-2.pdf";
                break;
            case 86:
                str = "bac-anglais-sci-solution-2017-2.pdf";
                break;
            case 87:
                str = "bac-francais-sci-solution-2017-2.pdf";
                break;
            case 88:
                str = "bac-comptabilite-sujet-solution-2017-1.pdf";
                break;
            case 89:
                str = "bac-economie-sujet-solution-2017-1.pdf";
                break;
            case 90:
                str = "bac-mathematiques-ges-solution-2017-1.pdf";
                break;
            case 91:
                str = "bac-hisgeo-ges-solution-2017-1.pdf";
                break;
            case 92:
                str = "bac-arabe-sci-solution-2017-1.pdf";
                break;
            case 93:
                str = "bac-droit-sujet-solution-2017-1.pdf";
                break;
            case 94:
                str = "bac-islamia-sujet-solution-2017-1.pdf";
                break;
            case 95:
                str = "bac-philosophie-gemt-solution-2017-1.pdf";
                break;
            case 96:
                str = "bac-anglais-sci-solution-2017-1.pdf";
                break;
            case 97:
                str = "bac-francais-sci-solution-2017-1.pdf";
                break;
            case 99:
                str = "bac-comptabilite-sujet-solution-2016.pdf";
                break;
            case 100:
                str = "bac-economie-sujet-solution-2016.pdf";
                break;
            case 101:
                str = "bac-mathematiques-ges-solution-2016.pdf";
                break;
            case 102:
                str = "bac-hisgeo-ges-solution-2016.pdf";
                break;
            case 103:
                str = "bac-arabe-sci-solution-2016.pdf";
                break;
            case 104:
                str = "bac-droit-sujet-solution-2016.pdf";
                break;
            case 105:
                str = "bac-islamia-sujet-solution-2016.pdf";
                break;
            case 106:
                str = "bac-philosophie-gemt-solution-2016.pdf";
                break;
            case 107:
                str = "bac-anglais-sci-solution-2016.pdf";
                break;
            case 108:
                str = "bac-francais-sci-solution-2016.pdf";
                break;
            case 110:
                str = "bac-comptabilite-sujet-solution-2015.pdf";
                break;
            case 111:
                str = "bac-economie-sujet-solution-2015.pdf";
                break;
            case 112:
                str = "bac-mathematiques-ges-solution-2015.pdf";
                break;
            case 113:
                str = "bac-hisgeo-ges-solution-2015.pdf";
                break;
            case 114:
                str = "bac-arabe-sci-solution-2015.pdf";
                break;
            case 115:
                str = "bac-droit-sujet-solution-2015.pdf";
                break;
            case 116:
                str = "bac-islamia-sujet-solution-2015.pdf";
                break;
            case 117:
                str = "bac-philosophie-gemt-solution-2015.pdf";
                break;
            case 118:
                str = "bac-anglais-sci-solution-2015.pdf";
                break;
            case 119:
                str = "bac-francais-sci-solution-2015.pdf";
                break;
            case 121:
                str = "bac-comptabilite-sujet-solution-2014.pdf";
                break;
            case 122:
                str = "bac-economie-sujet-solution-2014.pdf";
                break;
            case 123:
                str = "bac-mathematiques-ges-solution-2014.pdf";
                break;
            case 124:
                str = "bac-hisgeo-ges-solution-2014.pdf";
                break;
            case 125:
                str = "bac-arabe-sci-solution-2014.pdf";
                break;
            case 126:
                str = "bac-droit-sujet-solution-2014.pdf";
                break;
            case 127:
                str = "bac-islamia-sujet-solution-2014.pdf";
                break;
            case 128:
                str = "bac-philosophie-gemt-solution-2014.pdf";
                break;
            case Opcodes.LOR /* 129 */:
                str = "bac-anglais-sci-solution-2014.pdf";
                break;
            case 130:
                str = "bac-francais-sci-solution-2014.pdf";
                break;
            case Opcodes.IINC /* 132 */:
                str = "bac-comptabilite-sujet-solution-2013.pdf";
                break;
            case Opcodes.I2L /* 133 */:
                str = "bac-economie-sujet-solution-2013.pdf";
                break;
            case Opcodes.I2F /* 134 */:
                str = "bac-mathematiques-ges-solution-2013.pdf";
                break;
            case Opcodes.I2D /* 135 */:
                str = "bac-hisgeo-ges-solution-2013.pdf";
                break;
            case Opcodes.L2I /* 136 */:
                str = "bac-arabe-sci-solution-2013.pdf";
                break;
            case Opcodes.L2F /* 137 */:
                str = "bac-droit-sujet-solution-2013.pdf";
                break;
            case Opcodes.L2D /* 138 */:
                str = "bac-islamia-sujet-solution-2013.pdf";
                break;
            case Opcodes.F2I /* 139 */:
                str = "bac-philosophie-gemt-solution-2013.pdf";
                break;
            case Opcodes.F2L /* 140 */:
                str = "bac-anglais-sci-solution-2013.pdf";
                break;
            case Opcodes.F2D /* 141 */:
                str = "bac-francais-sci-solution-2013.pdf";
                break;
            case Opcodes.D2L /* 143 */:
                str = "bac-comptabilite-sujet-solution-2012.pdf";
                break;
            case Opcodes.D2F /* 144 */:
                str = "bac-economie-sujet-solution-2012.pdf";
                break;
            case Opcodes.I2B /* 145 */:
                str = "bac-mathematiques-ges-solution-2012.pdf";
                break;
            case Opcodes.I2C /* 146 */:
                str = "bac-hisgeo-ges-solution-2012.pdf";
                break;
            case Opcodes.I2S /* 147 */:
                str = "bac-arabe-sci-solution-2012.pdf";
                break;
            case Opcodes.LCMP /* 148 */:
                str = "bac-droit-sujet-solution-2012.pdf";
                break;
            case Opcodes.FCMPL /* 149 */:
                str = "bac-islamia-sujet-solution-2012.pdf";
                break;
            case Opcodes.FCMPG /* 150 */:
                str = "bac-philosophie-gemt-solution-2012.pdf";
                break;
            case Opcodes.DCMPL /* 151 */:
                str = "bac-anglais-sci-solution-2012.pdf";
                break;
            case Opcodes.DCMPG /* 152 */:
                str = "bac-francais-sci-solution-2012.pdf";
                break;
        }
        if (solutionsHolder2.getBindingAdapterPosition() > 152 || solutionsHolder2.getBindingAdapterPosition() < 1 || solutionsHolder2.getBindingAdapterPosition() == 11 || solutionsHolder2.getBindingAdapterPosition() == 22 || solutionsHolder2.getBindingAdapterPosition() == 33 || solutionsHolder2.getBindingAdapterPosition() == 44 || solutionsHolder2.getBindingAdapterPosition() == 55 || solutionsHolder2.getBindingAdapterPosition() == 66 || solutionsHolder2.getBindingAdapterPosition() == 77 || solutionsHolder2.getBindingAdapterPosition() == 98 || solutionsHolder2.getBindingAdapterPosition() == 109 || solutionsHolder2.getBindingAdapterPosition() == 120 || solutionsHolder2.getBindingAdapterPosition() == 131 || solutionsHolder2.getBindingAdapterPosition() == 142) {
            return;
        }
        TopicsSolutionsActivity.file_Name = str;
        TopicsSolutionsActivity.getInstance().openContent(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            Separate separate = (Separate) list.get(position);
            SeparatesHolder separatesHolder = (SeparatesHolder) holder;
            separatesHolder.txtTitle.setText(separate.getTitle());
            if (separate.isDarkmode()) {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#424445"));
                return;
            } else {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#E6ECEF"));
                return;
            }
        }
        Solutions solutions = (Solutions) list.get(position);
        SolutionsHolder solutionsHolder2 = (SolutionsHolder) holder;
        solutionsHolder2.txtModule.setText(solutions.getModule());
        solutionsHolder2.txtSubject.setText(solutions.getInformation());
        solutionsHolder2.imgItemTopicsSolutions.setImageResource(solutions.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return list.get(position) instanceof Separate ? 0 : 1;
    }

    public class SolutionsHolder extends RecyclerView.ViewHolder {
        private final ImageView imgItemTopicsSolutions;
        private final LinearLayout lytItemTopicsSolution;
        private final TextView txtModule;
        private final TextView txtSubject;

        SolutionsHolder(View itemView) {
            super(itemView);
            this.txtModule = (TextView) itemView.findViewById(R.id.txtModule);
            this.txtSubject = (TextView) itemView.findViewById(R.id.txtSubject);
            this.imgItemTopicsSolutions = (ImageView) itemView.findViewById(R.id.imgItemTopicsSolutions);
            this.lytItemTopicsSolution = (LinearLayout) itemView.findViewById(R.id.lytItemTopicsSolution);
        }
    }

    public class SeparatesHolder extends RecyclerView.ViewHolder {
        private final LinearLayout lytItemSeparate;
        private final TextView txtTitle;

        SeparatesHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            this.lytItemSeparate = (LinearLayout) itemView.findViewById(R.id.lytItemSeparate);
        }
    }
}
