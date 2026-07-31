package sg.bigo.ads.api;

/* loaded from: classes6.dex */
public interface RewardVideoAd extends InterstitialAd {
    @Override // sg.bigo.ads.api.Ad
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener);
}
