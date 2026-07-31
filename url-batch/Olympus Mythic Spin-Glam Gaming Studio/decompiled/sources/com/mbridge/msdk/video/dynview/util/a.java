package com.mbridge.msdk.video.dynview.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;

/* compiled from: UIControlUtil.java */
/* loaded from: classes3.dex */
public class a {
    public static int a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 1;
        }
        return campaignEx.getRewardTemplateMode().g();
    }

    public static int b(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
            int k = campaignEx.getRewardTemplateMode().k();
            if (k != 302 && k != 802 && k != 902) {
                if (k == 904) {
                    if (!a(campaignEx.getRewardTemplateMode().j())) {
                        return -1;
                    }
                }
            }
            return -3;
        }
        return 100;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String a(long j, Context context) {
        String p = m0.p(context);
        if (p.startsWith("zh")) {
            if (!p.contains("TW") && !p.contains("HK")) {
                return j + " 秒后自动播放";
            }
            return j + " 秒後自動播放";
        }
        if (p.startsWith("ja")) {
            return j + " 秒後自動的に再生 ";
        }
        if (p.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "Automatische Wiedergabe nach " + j + " Sekunden";
        }
        if (p.startsWith("ko")) {
            return j + " 초 후 자동 재생 ";
        }
        if (p.startsWith("fr")) {
            return "Lecture de vidéo dans " + j + " secondes";
        }
        if (p.startsWith("ar")) {
            return " ثوان" + j + "لعب تلقائيا بعد ";
        }
        if (p.startsWith("ru")) {
            return "Автовоспроизведение через " + j + " секунд";
        }
        return "Auto play after " + j + " s";
    }

    public static String a(Context context, int i) {
        String str;
        if (i == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String p = m0.p(context);
        if (p.startsWith("zh")) {
            if (!p.contains("TW") && !p.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (p.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        }
        if (p.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        }
        if (p.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        }
        if (p.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        }
        if (p.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        }
        if (p.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        }
        return "mbridge_reward_two_title_en" + str;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }
}
