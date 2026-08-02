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
import com.neptunesoft.gestionbacdz.adapter.TopicsAdapter;
import com.neptunesoft.gestionbacdz.classobjects.Separate;
import com.neptunesoft.gestionbacdz.classobjects.Topics;
import com.neptunesoft.gestionbacdz.fragment.TopicsFragment;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class TopicsAdapter extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static List list;
    static TopicsHolder topicsHolder;

    public TopicsAdapter(List list2) {
        list = list2;
    }

    private static Topics prepareTopics(Topics topics) {
        if (SplashScreen.darkmode) {
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle_dark);
        }
        return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle);
    }

    public static void change() {
        Topics prepareTopics;
        switch (topicsHolder.getBindingAdapterPosition()) {
            case 1:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 2:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 3:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 4:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 5:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 6:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 7:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 8:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 9:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 10:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
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
                prepareTopics = null;
                break;
            case 12:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 13:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 14:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 15:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 16:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 17:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 18:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 19:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 20:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 21:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 23:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 24:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 25:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 26:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 27:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 28:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 29:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 30:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 31:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 32:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 34:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 35:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 36:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 37:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 38:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 39:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 40:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 41:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 42:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 43:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 45:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 46:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 47:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 48:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 49:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 50:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 51:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 52:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 53:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 54:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 56:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 57:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 58:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 59:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 60:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 61:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 62:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 63:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 64:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 65:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 67:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 68:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 69:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 70:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 71:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 72:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 73:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 74:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 75:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 76:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 78:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 79:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 80:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 81:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 82:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 83:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 84:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 85:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 86:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 87:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 88:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 89:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 90:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 91:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 92:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 93:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 94:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 95:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0));
                break;
            case 96:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 97:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 99:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 100:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 101:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 102:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 103:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 104:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 105:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 106:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 107:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 108:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 110:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 111:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 112:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 113:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 114:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 115:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 116:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 117:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 118:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 119:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case 121:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case 122:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case 123:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 124:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 125:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 126:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case 127:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 128:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.LOR /* 129 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case 130:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IINC /* 132 */:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2L /* 133 */:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2F /* 134 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2D /* 135 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2I /* 136 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2F /* 137 */:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2D /* 138 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2I /* 139 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.F2L /* 140 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2D /* 141 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2L /* 143 */:
                prepareTopics = prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2F /* 144 */:
                prepareTopics = prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2B /* 145 */:
                prepareTopics = prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2C /* 146 */:
                prepareTopics = prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2S /* 147 */:
                prepareTopics = prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LCMP /* 148 */:
                prepareTopics = prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPL /* 149 */:
                prepareTopics = prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPG /* 150 */:
                prepareTopics = prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.DCMPL /* 151 */:
                prepareTopics = prepareTopics(new Topics("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPG /* 152 */:
                prepareTopics = prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0));
                break;
        }
        TopicsFragment.list.set(topicsHolder.getBindingAdapterPosition(), prepareTopics);
        list.set(topicsHolder.getBindingAdapterPosition(), prepareTopics);
        topicsHolder.imgItemTopicsSolutions.setImageResource(prepareTopics.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            return new SeparatesHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_separate_years, parent, false));
        }
        final TopicsHolder topicsHolder2 = new TopicsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topics_solutions, parent, false));
        topicsHolder = topicsHolder2;
        topicsHolder2.lytItemTopicsSolution.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.adapter.TopicsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicsAdapter.lambda$onCreateViewHolder$0(TopicsAdapter.TopicsHolder.this, view);
            }
        });
        return topicsHolder2;
    }

    static /* synthetic */ void lambda$onCreateViewHolder$0(TopicsHolder topicsHolder2, View view) {
        String str;
        TopicsSolutionsActivity.topics = true;
        topicsHolder = topicsHolder2;
        switch (topicsHolder2.getBindingAdapterPosition()) {
            case 1:
                str = "bac2024-gestion-ge.pdf";
                break;
            case 2:
                str = "bac2024-economy-ge.pdf";
                break;
            case 3:
                str = "bac2024-math-ge.pdf";
                break;
            case 4:
                str = "bac2024-hisgeo-ge.pdf";
                break;
            case 5:
                str = "bac2024-arabic-sci.pdf";
                break;
            case 6:
                str = "bac2024-droit-ge.pdf";
                break;
            case 7:
                str = "bac2024-islamic.pdf";
                break;
            case 8:
                str = "bac2024-philo-gemt.pdf";
                break;
            case 9:
                str = "bac2024-english-sci.pdf";
                break;
            case 10:
                str = "bac2024-french-sci.pdf";
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
                str = "bac2023-gestion-ge.pdf";
                break;
            case 13:
                str = "bac2023-economy-ge.pdf";
                break;
            case 14:
                str = "bac2023-math-ge.pdf";
                break;
            case 15:
                str = "bac2023-hisgeo-ge.pdf";
                break;
            case 16:
                str = "bac2023-arabic-sci.pdf";
                break;
            case 17:
                str = "bac2023-droit-ge.pdf";
                break;
            case 18:
                str = "bac2023-islamic.pdf";
                break;
            case 19:
                str = "bac2023-philo-gemt.pdf";
                break;
            case 20:
                str = "bac2023-english-sci.pdf";
                break;
            case 21:
                str = "bac2023-french-sci.pdf";
                break;
            case 23:
                str = "bac2022-gestion-ge.pdf";
                break;
            case 24:
                str = "bac2022-economy-ge.pdf";
                break;
            case 25:
                str = "bac2022-math-ge.pdf";
                break;
            case 26:
                str = "bac2022-hisgeo-ge.pdf";
                break;
            case 27:
                str = "bac2022-arabic-sci.pdf";
                break;
            case 28:
                str = "bac2022-droit-ge.pdf";
                break;
            case 29:
                str = "bac2022-islamic.pdf";
                break;
            case 30:
                str = "bac2022-philo-gemt.pdf";
                break;
            case 31:
                str = "bac2022-english-sci.pdf";
                break;
            case 32:
                str = "bac2022-french-sci.pdf";
                break;
            case 34:
                str = "bac-comptabilite-sujet-2021.pdf";
                break;
            case 35:
                str = "bac-economie-sujet-2021.pdf";
                break;
            case 36:
                str = "bac-mathematiques-ges-2021.pdf";
                break;
            case 37:
                str = "bac-hisgeo-ges-2021.pdf";
                break;
            case 38:
                str = "bac-arabe-sci-2021.pdf";
                break;
            case 39:
                str = "bac-droit-sujet-2021.pdf";
                break;
            case 40:
                str = "bac-islamia-sujet-2021.pdf";
                break;
            case 41:
                str = "bac-philosophie-gemt-2021.pdf";
                break;
            case 42:
                str = "bac-anglais-sci-2021.pdf";
                break;
            case 43:
                str = "bac-francais-sci-2021.pdf";
                break;
            case 45:
                str = "bac-comptabilite-sujet-2020.pdf";
                break;
            case 46:
                str = "bac-economie-sujet-2020.pdf";
                break;
            case 47:
                str = "bac-mathematiques-ges-2020.pdf";
                break;
            case 48:
                str = "bac-hisgeo-ges-2020.pdf";
                break;
            case 49:
                str = "bac-arabe-sci-2020.pdf";
                break;
            case 50:
                str = "bac-droit-sujet-2020.pdf";
                break;
            case 51:
                str = "bac-islamia-sujet-2020.pdf";
                break;
            case 52:
                str = "bac-philosophie-gemt-2020.pdf";
                break;
            case 53:
                str = "bac-anglais-sci-2020.pdf";
                break;
            case 54:
                str = "bac-francais-sci-2020.pdf";
                break;
            case 56:
                str = "bac-comptabilite-sujet-2019.pdf";
                break;
            case 57:
                str = "bac-economie-sujet-2019.pdf";
                break;
            case 58:
                str = "bac-mathematiques-ges-2019.pdf";
                break;
            case 59:
                str = "bac-hisgeo-ges-2019.pdf";
                break;
            case 60:
                str = "bac-arabe-sci-2019.pdf";
                break;
            case 61:
                str = "bac-droit-sujet-2019.pdf";
                break;
            case 62:
                str = "bac-islamia-sujet-2019.pdf";
                break;
            case 63:
                str = "bac-philosophie-gemt-2019.pdf";
                break;
            case 64:
                str = "bac-anglais-sci-2019.pdf";
                break;
            case 65:
                str = "bac-francais-sci-2019.pdf";
                break;
            case 67:
                str = "bac-comptabilite-sujet-2018.pdf";
                break;
            case 68:
                str = "bac-economie-sujet-2018.pdf";
                break;
            case 69:
                str = "bac-mathematiques-ges-2018.pdf";
                break;
            case 70:
                str = "bac-hisgeo-ges-2018.pdf";
                break;
            case 71:
                str = "bac-arabe-sci-2018.pdf";
                break;
            case 72:
                str = "bac-droit-sujet-2018.pdf";
                break;
            case 73:
                str = "bac-islamia-sujet-2018.pdf";
                break;
            case 74:
                str = "bac-philosophie-gemt-2018.pdf";
                break;
            case 75:
                str = "bac-anglais-sci-2018.pdf";
                break;
            case 76:
                str = "bac-francais-sci-2018.pdf";
                break;
            case 78:
                str = "bac-comptabilite-sujet-2017-2.pdf";
                break;
            case 79:
                str = "bac-economie-sujet-2017-2.pdf";
                break;
            case 80:
                str = "bac-mathematiques-ges-2017-2.pdf";
                break;
            case 81:
                str = "bac-hisgeo-ges-2017-2.pdf";
                break;
            case 82:
                str = "bac-arabe-sci-2017-2.pdf";
                break;
            case 83:
                str = "bac-droit-sujet-2017-2.pdf";
                break;
            case 84:
                str = "bac-islamia-sujet-2017-2.pdf";
                break;
            case 85:
                str = "bac-philosophie-gemt-2017-2.pdf";
                break;
            case 86:
                str = "bac-anglais-sci-2017-2.pdf";
                break;
            case 87:
                str = "bac-francais-sci-2017-2.pdf";
                break;
            case 88:
                str = "bac-comptabilite-sujet-2017-1.pdf";
                break;
            case 89:
                str = "bac-economie-sujet-2017-1.pdf";
                break;
            case 90:
                str = "bac-mathematiques-ges-2017-1.pdf";
                break;
            case 91:
                str = "bac-hisgeo-ges-2017-1.pdf";
                break;
            case 92:
                str = "bac-arabe-sci-2017-1.pdf";
                break;
            case 93:
                str = "bac-droit-sujet-2017-1.pdf";
                break;
            case 94:
                str = "bac-islamia-sujet-2017-1.pdf";
                break;
            case 95:
                str = "bac-philosophie-gemt-2017-1.pdf";
                break;
            case 96:
                str = "bac-anglais-sci-2017-1.pdf";
                break;
            case 97:
                str = "bac-francais-sci-2017-1.pdf";
                break;
            case 99:
                str = "bac-comptabilite-sujet-2016.pdf";
                break;
            case 100:
                str = "bac-economie-sujet-2016.pdf";
                break;
            case 101:
                str = "bac-mathematiques-ges-2016.pdf";
                break;
            case 102:
                str = "bac-hisgeo-ges-2016.pdf";
                break;
            case 103:
                str = "bac-arabe-sci-2016.pdf";
                break;
            case 104:
                str = "bac-droit-sujet-2016.pdf";
                break;
            case 105:
                str = "bac-islamia-sujet-2016.pdf";
                break;
            case 106:
                str = "bac-philosophie-gemt-2016.pdf";
                break;
            case 107:
                str = "bac-anglais-sci-2016.pdf";
                break;
            case 108:
                str = "bac-francais-sci-2016.pdf";
                break;
            case 110:
                str = "bac-comptabilite-sujet-2015.pdf";
                break;
            case 111:
                str = "bac-economie-sujet-2015.pdf";
                break;
            case 112:
                str = "bac-mathematiques-ges-2015.pdf";
                break;
            case 113:
                str = "bac-hisgeo-ges-2015.pdf";
                break;
            case 114:
                str = "bac-arabe-sci-2015.pdf";
                break;
            case 115:
                str = "bac-droit-sujet-2015.pdf";
                break;
            case 116:
                str = "bac-islamia-sujet-2015.pdf";
                break;
            case 117:
                str = "bac-philosophie-gemt-2015.pdf";
                break;
            case 118:
                str = "bac-anglais-sci-2015.pdf";
                break;
            case 119:
                str = "bac-francais-sci-2015.pdf";
                break;
            case 121:
                str = "bac-comptabilite-sujet-2014.pdf";
                break;
            case 122:
                str = "bac-economie-sujet-2014.pdf";
                break;
            case 123:
                str = "bac-mathematiques-ges-2014.pdf";
                break;
            case 124:
                str = "bac-hisgeo-ges-2014.pdf";
                break;
            case 125:
                str = "bac-arabe-sci-2014.pdf";
                break;
            case 126:
                str = "bac-droit-sujet-2014.pdf";
                break;
            case 127:
                str = "bac-islamia-sujet-2014.pdf";
                break;
            case 128:
                str = "bac-philosophie-gemt-2014.pdf";
                break;
            case Opcodes.LOR /* 129 */:
                str = "bac-anglais-sci-2014.pdf";
                break;
            case 130:
                str = "bac-francais-sci-2014.pdf";
                break;
            case Opcodes.IINC /* 132 */:
                str = "bac-comptabilite-sujet-2013.pdf";
                break;
            case Opcodes.I2L /* 133 */:
                str = "bac-economie-sujet-2013.pdf";
                break;
            case Opcodes.I2F /* 134 */:
                str = "bac-mathematiques-ges-2013.pdf";
                break;
            case Opcodes.I2D /* 135 */:
                str = "bac-hisgeo-ges-2013.pdf";
                break;
            case Opcodes.L2I /* 136 */:
                str = "bac-arabe-sci-2013.pdf";
                break;
            case Opcodes.L2F /* 137 */:
                str = "bac-droit-sujet-2013.pdf";
                break;
            case Opcodes.L2D /* 138 */:
                str = "bac-islamia-sujet-2013.pdf";
                break;
            case Opcodes.F2I /* 139 */:
                str = "bac-philosophie-gemt-2013.pdf";
                break;
            case Opcodes.F2L /* 140 */:
                str = "bac-anglais-sci-2013.pdf";
                break;
            case Opcodes.F2D /* 141 */:
                str = "bac-francais-sci-2013.pdf";
                break;
            case Opcodes.D2L /* 143 */:
                str = "bac-comptabilite-sujet-2012.pdf";
                break;
            case Opcodes.D2F /* 144 */:
                str = "bac-economie-sujet-2012.pdf";
                break;
            case Opcodes.I2B /* 145 */:
                str = "bac-mathematiques-ges-2012.pdf";
                break;
            case Opcodes.I2C /* 146 */:
                str = "bac-hisgeo-ges-2012.pdf";
                break;
            case Opcodes.I2S /* 147 */:
                str = "bac-arabe-sci-2012.pdf";
                break;
            case Opcodes.LCMP /* 148 */:
                str = "bac-droit-sujet-2012.pdf";
                break;
            case Opcodes.FCMPL /* 149 */:
                str = "bac-islamia-sujet-2012.pdf";
                break;
            case Opcodes.FCMPG /* 150 */:
                str = "bac-philosophie-gemt-2012.pdf";
                break;
            case Opcodes.DCMPL /* 151 */:
                str = "bac-anglais-sci-2012.pdf";
                break;
            case Opcodes.DCMPG /* 152 */:
                str = "bac-francais-sci-2012.pdf";
                break;
        }
        if (topicsHolder2.getBindingAdapterPosition() > 152 || topicsHolder2.getBindingAdapterPosition() < 1 || topicsHolder2.getBindingAdapterPosition() == 11 || topicsHolder2.getBindingAdapterPosition() == 22 || topicsHolder2.getBindingAdapterPosition() == 33 || topicsHolder2.getBindingAdapterPosition() == 44 || topicsHolder2.getBindingAdapterPosition() == 55 || topicsHolder2.getBindingAdapterPosition() == 66 || topicsHolder2.getBindingAdapterPosition() == 77 || topicsHolder2.getBindingAdapterPosition() == 98 || topicsHolder2.getBindingAdapterPosition() == 109 || topicsHolder2.getBindingAdapterPosition() == 120 || topicsHolder2.getBindingAdapterPosition() == 131 || topicsHolder2.getBindingAdapterPosition() == 142) {
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
        Topics topics = (Topics) list.get(position);
        TopicsHolder topicsHolder2 = (TopicsHolder) holder;
        topicsHolder2.txtModule.setText(topics.getModule());
        topicsHolder2.txtSubject.setText(topics.getInformation());
        topicsHolder2.imgItemTopicsSolutions.setImageResource(topics.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return list.get(position) instanceof Separate ? 0 : 1;
    }

    public static class TopicsHolder extends RecyclerView.ViewHolder {
        private final ImageView imgItemTopicsSolutions;
        private final LinearLayout lytItemTopicsSolution;
        private final TextView txtModule;
        private final TextView txtSubject;

        TopicsHolder(View itemView) {
            super(itemView);
            this.txtModule = (TextView) itemView.findViewById(R.id.txtModule);
            this.txtSubject = (TextView) itemView.findViewById(R.id.txtSubject);
            this.imgItemTopicsSolutions = (ImageView) itemView.findViewById(R.id.imgItemTopicsSolutions);
            this.lytItemTopicsSolution = (LinearLayout) itemView.findViewById(R.id.lytItemTopicsSolution);
        }
    }

    public static class SeparatesHolder extends RecyclerView.ViewHolder {
        private final LinearLayout lytItemSeparate;
        private final TextView txtTitle;

        SeparatesHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            this.lytItemSeparate = (LinearLayout) itemView.findViewById(R.id.lytItemSeparate);
        }
    }
}
