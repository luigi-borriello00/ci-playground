var config = require('semantic-release-preconfigured-conventional-commits');
config.plugins.push(
    [
        "@semantic-release/changelog",
        {
            "changelogFile": "CHANGELOG.md"
        }
    ],
    "@semantic-release/github",
    "@semantic-release/git",
)
module.exports = config
