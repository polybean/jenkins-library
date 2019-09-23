def call(project, domain, srcDirectory, useModule = true) {
    dir(srcDirectory) {
        addr = "${project}-${env.BUILD_NUMBER}-${env.BRANCH_NAME}.${domain}"
        if (useModule) {
            sh "go get -d -v -t"
        } else {
            sh "go mod download"
        }

        sh "ADDRESS=${addr} go test ./... -v --run FunctionalTest"
    }
}
