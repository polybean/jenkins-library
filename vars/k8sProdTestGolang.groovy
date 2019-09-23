def call(address, srcDirectory, useModule = true) {
    dir(srcDirectory) {
        if (useModule) {
            sh "go mod download"
        } else {
            sh "go get -d -v -t"
        }
        sh "DURATION=1 ADDRESS=${address} go test ./... -v --run ProductionTest"
    }
}
