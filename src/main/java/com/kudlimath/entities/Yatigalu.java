/**
 * © Copyright SanSys Pvt. Ltd. All rights reserved. SanSys is a registered trademark and the SanSys graphic logo is a trademark of SanSys Pvt. Ltd.
 * SanSys reserves all the right for this source code. You should not modify or reuse without the noticing it to SanSys. And need to provide 
 * credits where applicable. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific governing permissions and
 * limitations under the License.
 *
 * @author - Sanjeev
 * @version - 1.0
 * @CreatedOn - 08-Aug-2023 9:16:15 pm
 * @Usage - 
 *
 */

package com.kudlimath.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Yatigalu {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long id;
  
  public String peetadhipati;
  
  public String periodFrom;
  
  public String periodTo;
  
  public String brindavanaPlace;
  
  public String aaradhane;
  
  public String details;
    
}
