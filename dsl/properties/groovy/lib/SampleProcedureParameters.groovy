
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class SampleProcedureParameters {
    /**
    * Label: Application Path, type: entry
    */
    String applicationPath

    static SampleProcedureParameters initParameters(StepParameters sp) {
        SampleProcedureParameters parameters = new SampleProcedureParameters()

        def applicationPath = sp.getRequiredParameter('applicationPath').value
        parameters.applicationPath = applicationPath

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 23fcbcfbce0e69f239b83a65cc8d2099 ===
