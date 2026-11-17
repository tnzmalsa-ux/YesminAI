# YESMIN AI — Personal AI Companion & JARVIS-Style Android Assistant

Native Android application built with **Kotlin**, **Jetpack Compose (Material 3)**, **Room**, **DataStore + Android Keystore**, **Android SpeechRecognizer / TextToSpeech**, and **Google Gemini REST API**.

## Build & Download APK via GitHub Actions (No PC Required)
1. Push or commit all files to the `main` branch of your GitHub repository.
2. Open the **Actions** tab in GitHub and select **Build Yesmin AI Android APK**.
3. Wait for the **Test & Build Debug APK** job to complete (green checkmark).
4. Scroll to **Artifacts** and download **`yesmin-ai-debug-apk`** (extract the `.zip` to get `app-debug.apk`).
5. Install `app-debug.apk` on your Android 8.0+ phone.

## Security & Privacy
- **Never commit real API keys to GitHub.** Configure your Gemini API key inside the app under **Settings > AI Brain**.
- Your API key is encrypted locally using **Android Keystore (AES-256-GCM)** and excluded from Android cloud backups.
- Phone automation uses a strict local allowlist; optional `AccessibilityService` remains disabled unless explicitly enabled by you.
