# FreeTube — Security baseline: Phase 1

## Repository and starting revision

- Original: https://github.com/yuliskov/SmartTube
- Personal fork: https://github.com/mathiasuy/FreeTube
- Baseline commit: `4b3f333e540a1403429d1a9d86dec758e59288f9` (2026-10-28)
- Working branch: `security/harden-baseline`

## Changes in this pull request

1. Disable inherited automatic and manual app-update paths.
2. Remove remote beta/stable update manifest URLs.
3. Disable update checks during startup.
4. Disable voice bridge and stable-version APK downloading/installing.
5. Hide inherited update and bridge-install UI actions.

**This is a source-level hardening step, not a malware-free certification.**
Do not yet sign into a personal Google account or install it on a daily-use TV.
No APK has been compiled, scanned or tested in this PR.

## Required follow-up before running

- [ ] Audit the exact pinned Git submodules `SharedModules` and `MediaServiceCore`, including their Gradle code and nested submodules.
- [ ] Inventory third-party dependencies, JitPack sources, bundled JARs and native libraries (including `.so`); verify provenance and hashes.
- [ ] Review GitHub Actions workflows before executing builds.
- [ ] Locate other download, package installation and network access paths.
- [ ] Review `usesCleartextTraffic=true`, `allowBackup=true`, permission declarations and Firebase/Crashlytics.
- [ ] Assign a separate Android package ID and personal APK signing key.
- [ ] Build in an isolated environment without personal credentials and inspect the resulting APK and network activity.
- [ ] Run functional regression checks before merging.

Do not treat this PR as safe to merge until the full review is completed.
