package section1;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection;

public class InstallTest {

	public static void main(String[] args) {
		
		Pipeline pipeline=Pipeline.create();
		PCollection<String> outputList = pipeline.apply(TextIO.read().from("/home/sabb/Documents/Beam/Section1/input.csv"));
		outputList.apply(TextIO.write().to("/home/sabb/Documents/Beam/Section1/output.csv").withNumShards(1).withSuffix(".csv"));
		
		pipeline.run();
		
	}
}