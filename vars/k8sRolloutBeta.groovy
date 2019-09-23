def call(project) {
    chartName = "${project}-${env.BUILD_NUMBER}-${env.BRANCH_NAME}"
    sh "kubectl -n build rollout status deployment ${chartName.toLowerCase()}"
}
