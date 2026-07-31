package io.branch.referral;

import android.app.Activity;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.BranchEvent;
import io.branch.referral.util.LinkProperties;
import io.branch.referral.util.SharingUtil;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes7.dex */
public class NativeShareLinkManager {
    private static volatile NativeShareLinkManager INSTANCE;
    Branch.BranchNativeLinkShareListener nativeLinkShareListenerCallback_;

    private NativeShareLinkManager() {
    }

    public static NativeShareLinkManager getInstance() {
        if (INSTANCE == null) {
            synchronized (NativeShareLinkManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NativeShareLinkManager();
                }
            }
        }
        return INSTANCE;
    }

    void shareLink(final Activity activity, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, final Branch.BranchNativeLinkShareListener branchNativeLinkShareListener, final String str, final String str2) {
        NativeShareLinkManager nativeShareLinkManager;
        this.nativeLinkShareListenerCallback_ = new NativeLinkShareListenerWrapper(branchNativeLinkShareListener, linkProperties, branchUniversalObject);
        try {
            nativeShareLinkManager = this;
        } catch (Exception e) {
            e = e;
            nativeShareLinkManager = this;
        }
        try {
            branchUniversalObject.generateShortUrl(activity, linkProperties, new Branch.BranchLinkCreateListener() { // from class: io.branch.referral.NativeShareLinkManager.1
                @Override // io.branch.referral.Branch.BranchLinkCreateListener
                public void onLinkCreate(String str3, BranchError branchError) {
                    if (branchError == null) {
                        SharingUtil.share(str3, str, str2, activity);
                        return;
                    }
                    Branch.BranchNativeLinkShareListener branchNativeLinkShareListener2 = branchNativeLinkShareListener;
                    if (branchNativeLinkShareListener2 != null) {
                        branchNativeLinkShareListener2.onLinkShareResponse(str3, branchError);
                    } else {
                        BranchLogger.v("Unable to share link " + branchError.getMessage());
                    }
                    if (branchError.getErrorCode() == -113 || branchError.getErrorCode() == -117) {
                        SharingUtil.share(str3, str, str2, activity);
                    }
                }
            });
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            BranchLogger.e(stringWriter.toString());
            Branch.BranchNativeLinkShareListener branchNativeLinkShareListener2 = nativeShareLinkManager.nativeLinkShareListenerCallback_;
            if (branchNativeLinkShareListener2 != null) {
                branchNativeLinkShareListener2.onLinkShareResponse(null, new BranchError("Trouble sharing link", -110));
            } else {
                BranchLogger.v("Unable to share link. " + exc.getMessage());
            }
        }
    }

    public Branch.BranchNativeLinkShareListener getLinkShareListenerCallback() {
        return this.nativeLinkShareListenerCallback_;
    }

    private class NativeLinkShareListenerWrapper implements Branch.BranchNativeLinkShareListener {
        private final Branch.BranchNativeLinkShareListener branchNativeLinkShareListener_;
        private final BranchUniversalObject buo_;
        private String channelSelected_ = "";

        NativeLinkShareListenerWrapper(Branch.BranchNativeLinkShareListener branchNativeLinkShareListener, LinkProperties linkProperties, BranchUniversalObject branchUniversalObject) {
            this.branchNativeLinkShareListener_ = branchNativeLinkShareListener;
            this.buo_ = branchUniversalObject;
        }

        @Override // io.branch.referral.Branch.BranchNativeLinkShareListener
        public void onLinkShareResponse(String str, BranchError branchError) {
            BranchEvent branchEvent = new BranchEvent(BRANCH_STANDARD_EVENT.SHARE);
            if (branchError == null) {
                branchEvent.addCustomDataProperty(Defines.Jsonkey.SharedLink.getKey(), str);
                branchEvent.addCustomDataProperty(Defines.Jsonkey.SharedChannel.getKey(), this.channelSelected_);
                branchEvent.addContentItems(this.buo_);
            } else {
                branchEvent.addCustomDataProperty(Defines.Jsonkey.ShareError.getKey(), branchError.getMessage());
            }
            branchEvent.logEvent(Branch.getInstance().getApplicationContext());
            Branch.BranchNativeLinkShareListener branchNativeLinkShareListener = this.branchNativeLinkShareListener_;
            if (branchNativeLinkShareListener != null) {
                branchNativeLinkShareListener.onLinkShareResponse(str, branchError);
            }
        }

        @Override // io.branch.referral.Branch.BranchNativeLinkShareListener
        public void onChannelSelected(String str) {
            this.channelSelected_ = str;
            Branch.BranchNativeLinkShareListener branchNativeLinkShareListener = this.branchNativeLinkShareListener_;
            if (branchNativeLinkShareListener != null) {
                branchNativeLinkShareListener.onChannelSelected(str);
            }
        }
    }
}
