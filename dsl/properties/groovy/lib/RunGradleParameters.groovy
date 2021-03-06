
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class RunGradleParameters {
    /**
    * Label: Tasks, type: entry
    */
    String tasks
    /**
    * Label: Options, type: entry
    */
    String options
    /**
    * Label: Workspace Dir, type: entry
    */
    String workspaceDir
    /**
    * Label: Use Wrapper?, type: checkbox
    */
    boolean useWrapper
    /**
    * Label: Save Log?, type: checkbox
    */
    boolean saveLogs

    static RunGradleParameters initParameters(StepParameters sp) {
        RunGradleParameters parameters = new RunGradleParameters()

        def tasks = sp.getRequiredParameter('tasks').value
        parameters.tasks = tasks
        def options = sp.getParameter('options').value
        parameters.options = options
        def workspaceDir = sp.getParameter('workspaceDir').value
        parameters.workspaceDir = workspaceDir
        def useWrapper = sp.getParameter('useWrapper').value == "true"
        parameters.useWrapper = useWrapper
        def saveLogs = sp.getParameter('saveLogs').value == "true"
        parameters.saveLogs = saveLogs

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 6b8ebdd91d73d7b8b24a0e07740dff83 ===
