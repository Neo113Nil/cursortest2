# Cloaking hints — Аvіаtоr Rise (com.mNbVcXz.lKjHgFd)

- Play title = APK application-label = «Аvіаtоr Rise».
- Application: `com.pairip.application.Application` (PairIP LicenseClient), затем `com.sulstpcivpb431i5t3abpp.MainApplication`.
- Лаунчер: `com.sulstpcivpb431i5t3abpp.MainActivity` (React Native). В onCreate кладёт extras `url` / `sendid` в SharedPreferences `zksuspjeyvcw4nStorage`.
- Нативные модули клоаки (`com.zksuspjeyvcw4n`): GAID, User-Agent, package/version, GL renderer, Play Integrity token (cloud project 225022121874), pendingPushUrl / pendingSendId.
- Показ оффера: JS вызывает `Vzksuspjeyvcw4niewportReactModule.navzksuspjeyvcw4nigate(url)` → `hqc.wkl.mnb` → WebView.loadUrl. shouldOverrideUrlLoading: diia.app / pay.widget.blog / t.me / intent / market / tg → ACTION_VIEW.
- Custom Tabs SDK нет. Адрес проверки в Java не зашит (логика в обфусцированном Hermes bytecode v96).
- `config.ru` в `splits0.xml` — языковой сплит `split="config.ru"`, не сетевой хост.
