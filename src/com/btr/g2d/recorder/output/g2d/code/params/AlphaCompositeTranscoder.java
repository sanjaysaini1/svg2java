package com.btr.g2d.recorder.output.g2d.code.params;

import java.awt.AlphaComposite;
import java.io.IOException;
import java.io.Writer;

import com.btr.g2d.recorder.output.g2d.code.CodeContext;

/*****************************************************************************
 * Transcode an AlphaComposite.
 *
 * @author Bernd Rosstauscher
 ****************************************************************************/

public class AlphaCompositeTranscoder extends InlineParameterTranscoder {

	/*************************************************************************
	 * writeParameterUsageBlock
	 * @throws IOException 
	 * @see com.btr.g2d.recorder.output.g2d.code.params.ParameterTranscoder#writeParameterUsageBlock(com.btr.g2d.recorder.output.g2d.code.CodeContext, java.io.Writer, java.lang.Object)
	 ************************************************************************/
	@Override
	public void writeParameterUsageBlock(CodeContext context,
			Writer paramBlockWriter, Object object) throws IOException {
		AlphaComposite ac = (AlphaComposite) object;
		paramBlockWriter.append(" AlphaComposite.getInstance(")
			.append(""+ac.getRule()).append(", ")
			.append(""+ac.getAlpha()).append("f)");
	}

}
