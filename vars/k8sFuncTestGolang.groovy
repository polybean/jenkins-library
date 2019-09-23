def call(project, domain, srcDirectory, useModule = true) {
    dir(srcDirectory) {
        addr = "${project}-${env.BUILD_NUMBER}-${env.BRANCH_NAME}.${domain}"
        if (useModule) {
            sh "go mod download"
        } else {
            sh "go get -d -v -t"
        }

        sh "ADDRESS=${addr} go test ./... -v --run FunctionalTest"
    }
}
